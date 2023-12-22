// http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_11_B

import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Dice {
	private List<Integer> numbers;
	
	public Dice(List<Integer> numbers) {
		this.numbers = numbers;
	}

	public int getNumber(int index) {
		return numbers.get(index);
	}
}

enum Command {
	N, E, W, S;
	
	public static List<Command> toCommands(String line) {
    	return line.chars()
        		.mapToObj(c -> toCommand((char) c))
        		.collect(Collectors.toList());
	}

	public static Command toCommand(char c) {
		switch (c) {
			case 'N':
				return N;
			case 'E':
				return E;
			case 'W':
				return W;
			case 'S':
				return S;
			default:
				throw new IllegalArgumentException("?????????????????????????????§???: " + c);
		}
    }
}

/**
 * ????¨??±????????????????????????????????????¨?????????
 * <pre>
 *   0
 * 3 1 2 4
 *   5
 * </pre>
 * ??????????????????0???top???2???east???
 */
class DiceState {

	private int top = 0;
	private int south = 1;
	private int east = 2;
	private int west = 3;
	private int north = 4;
	private int bottom = 5;
	
	public DiceState() {
	}
	
	private DiceState(int top, int south, int east, int west, int north, int bottom) {
		this.top = top;
		this.south = south;
		this.east = east;
		this.west = west;
		this.north = north;
		this.bottom = bottom;
	}
	
	public DiceState runCommand(Command command) {
		switch (command) {
			case N:
				return new DiceState(south, bottom, east, west, top, north);
			case S:
				return new DiceState(north, top, east, west, bottom, south);
			case E:
				return new DiceState(west, south, top, bottom, north, east);
			case W:
				return new DiceState(east, south, bottom, top, north, west);
			default:
				throw new IllegalStateException("????????????????????????????????????????£??????????");
		}
	}

	public int getTopNumber(Dice dice) {
		return dice.getNumber(top);
	}

	public int getSouthNumber(Dice dice) {
		return dice.getNumber(south);
	}

	public int getEastNumber(Dice dice) {
		return dice.getNumber(east);
	}

	public static Set<DiceState> allStates() {
		// ??????????????????????????¢??????????????????????????¨??±???????¶????????????????
		// E?????°??????6?????¨??¨????????????N??????????????¢??????4??????????????????????¨?24??±?????????
		List<Command> commands = Command.toCommands("NNNENNNWNNNWNNNENNNENNN");
		Set<DiceState> states = new HashSet<>();
		DiceState state = new DiceState();
		states.add(state);
		for (Command command : commands) {
			state = state.runCommand(command);
			states.add(state);
		}
		return states;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bottom;
		result = prime * result + east;
		result = prime * result + north;
		result = prime * result + south;
		result = prime * result + top;
		result = prime * result + west;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DiceState other = (DiceState) obj;
		if (bottom != other.bottom)
			return false;
		if (east != other.east)
			return false;
		if (north != other.north)
			return false;
		if (south != other.south)
			return false;
		if (top != other.top)
			return false;
		if (west != other.west)
			return false;
		return true;
	}
}

class Question {
	int top;
	int south;
	
	public Question(int top, int south) {
		this.top = top;
		this.south = south;
	}
}

public class Main {

	public void run(InputStream in, PrintStream out) {
        Input input = parseInput(in);
        
        Set<DiceState> allStates = DiceState.allStates();
        input.questions.stream().parallel()
        	.map(q -> answer(q, input.dice, allStates))
        	.forEachOrdered(out::println);
    }

    private String answer(Question q, Dice dice, Set<DiceState> allStates) {
    	Optional<DiceState> found = allStates.stream().parallel()
    		.filter(state -> isMatch(q, dice, state))
    		.findFirst();
    	
    	return found.map(s -> String.valueOf(s.getEastNumber(dice)))
    		.orElseThrow(() -> new IllegalStateException("not found"));
	}
    
    private boolean isMatch(Question q, Dice dice, DiceState state) {
    	return state.getTopNumber(dice) == q.top && state.getSouthNumber(dice) == q.south;
    }

	private Input parseInput(InputStream in) {
        try (Scanner scanner = new Scanner(in)) {
	    	Dice dice = lineToDice(nextLine(scanner, "??????????????¢?????°"));
	    	int q = nextLineInt(scanner, "???????????°");
	    	List<Question> questions = Stream.generate(() -> nextLine(scanner, "??????"))
	    			.limit(q)
	    			.map(this::lineToQuestion)
	    			.collect(Collectors.toList());
	    	return new Input(dice, questions);
        }
    }
    
	private Dice lineToDice(String line) {
    	try (Scanner scanner = new Scanner(line)) {
	    	List<Integer> numbers = Stream.generate(() -> Integer.valueOf(scanner.nextInt()))
	        		.limit(6)
	        		.collect(Collectors.toList());
	        return new Dice(numbers);
    	} catch (Exception e) {
    		throw new IllegalArgumentException("??????????????¢?????°????????£??§???: " + line, e);
    	}
	}
	
	private Question lineToQuestion(String line) {
    	try (Scanner scanner = new Scanner(line)) {
    		int top = scanner.nextInt();
    		int south = scanner.nextInt();
    		return new Question(top, south);
    	} catch (Exception e) {
    		throw new IllegalArgumentException("??????????????£??§???: " + line, e);
    	}
	}

	private static class Input {
		Dice dice;
		List<Question> questions;
		
		public Input(Dice dice, List<Question> questions) {
			this.dice = dice;
			this.questions = questions;
		}
	}

    private String nextLine(Scanner scanner, String label) {
    	try {
    		return scanner.nextLine();
    	} catch (Exception e) {
    		throw new IllegalArgumentException(label + "??????????????\????????????????????????", e);
    	}
    }
    
    private int nextLineInt(Scanner scanner, String label) {
    	String line = nextLine(scanner, label);
    	try {
    		return Integer.parseInt(line);
    	} catch (Exception e) {
    		throw new IllegalArgumentException(label + "??????????????\????????°?????§??????????????????", e);
    	}
	}

    public static void main(String[] args) {
        try {
            new Main().run(System.in, System.out);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }

}