import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;
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
	N, E, W, S
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

	public int getTopIndex() {
		return top;
	}
}

public class Main {

	public void run(InputStream in, PrintStream out) {
        Input input = parseInput(in);
        DiceState state = new DiceState();
        for (Command command : input.commands) {
        	state = state.runCommand(command);
        }
        int number = input.dice.getNumber(state.getTopIndex());
        out.println(number);
    }

    private Input parseInput(InputStream in) {
        try (Scanner scanner = new Scanner(in)) {
	    	Dice dice = lineToDice(nextLine(scanner, "??????????????¢?????°"));
	    	List<Command> commands = lineToCommands(nextLine(scanner, "??????"));
	    	return new Input(dice, commands);
        }
    }
    
    private List<Command> lineToCommands(String line) {
    	return line.chars()
        		.mapToObj(this::toCommand)
        		.collect(Collectors.toList());
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

	private Command toCommand(int c) {
		char ch = (char) c;
		try {
	    	return Command.valueOf(String.valueOf(ch));
		} catch (Exception e) {
			throw new IllegalArgumentException("?????????????????????????????§???: " + ch);
		}
    }
    
	private static class Input {
		Dice dice;
		List<Command> commands;
		
		public Input(Dice dice, List<Command> commands) {
			this.dice = dice;
			this.commands = commands;
		}
	}

    private String nextLine(Scanner scanner, String label) {
    	try {
    		return scanner.nextLine();
    	} catch (Exception e) {
    		throw new IllegalArgumentException(label + "??????????????\????????????????????????", e);
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