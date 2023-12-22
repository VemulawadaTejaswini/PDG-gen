import java.util.*;

public class Main {
    private static int check(int[] lines) {
	if(lines[0] + lines[1] <= lines[2]) {
	    return 0;
	}

	for(int i = 0, i_len = lines.length; i < i_len; i += 1) {
	    lines[i] *= lines[i];
	}

	if(lines[0] + lines[1] > lines[2]) {
	    return 1;
	} else if(lines[0] + lines[1] == lines[2]) {
	    return 2;
	}

	return 3;
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] results = new int[4];
	int count = 0;

	while(sc.hasNext()) {
	    String[] inputs = (sc.nextLine()).split(" ");
	    int[] lines = new int[inputs.length];

	    for(int i = 0, i_len = lines.length; i < i_len; i += 1){
		lines[i] = Integer.parseInt(inputs[i]);
	    }

	    Arrays.sort(lines);

	    ++results[check(lines)];

	    if(results[0] == 1) {
		break;
	    }

	    ++count;
	}

	System.out.print(count + " ");
	for(int i = 1, i_len = results.length - 1; i < i_len; i += 1) {
	    System.out.print(results[i] + " ");
	}
	System.out.println(results[results.length - 1]);
    }
}