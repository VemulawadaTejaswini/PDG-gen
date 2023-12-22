
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
		List<Integer> collect = IntStream.range(0, 1).mapToObj(Integer::valueOf).collect(Collectors.toList());
		
        Input input = parseInput(in);
        DiceState state = new DiceState();
        for (Command command : input.commands) {
        	state = state.runCommand(command);
        }
        int number = input.dice.getNumber(state.getTopIndex());
        out.println(number);
    }

    private Input parseInput(InputStream in) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
	    	Dice dice = lineToDice(nextLine(reader, "??????????????¢?????°"));
	    	List<Command> commands = lineToCommands(nextLine(reader, "??????"));
	    	return new Input(dice, commands);
        } catch (IOException e) {
    		throw new IllegalArgumentException("??\???????????????????????±???????????????", e);
        }
    }
    
    private List<Command> lineToCommands(String line) {
    	char[] chars = line.toCharArray();
    	List<Command> commands = new ArrayList<>(chars.length);
    	for (char c : line.toCharArray()) {
    		commands.add(toCommand(c));
    	}
    	return commands;
	}

	private Dice lineToDice(String line) {
		String[] numberStrings = line.split(" ");
		if (numberStrings.length != 6) {
    		throw new IllegalArgumentException("??????????????¢?????°????????£??§???: " + line);
		}

		try {
			List<Integer> numbers = new ArrayList<>();
			for (String numberString : numberStrings) {
				numbers.add(Integer.valueOf(numberString));
			}
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

    private String nextLine(BufferedReader reader, String label) {
    	String line;
    	try {
        	line = reader.readLine();
    	} catch (Exception e) {
    		throw new IllegalArgumentException(label + "??????????????\???????????????????????????", e);
    	}
    	
    	if (line == null) {
    		throw new IllegalArgumentException(label + "??????????????\????????????????????????");
    	}
    	return line;
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