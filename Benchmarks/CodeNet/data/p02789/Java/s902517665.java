import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    ArrayList<Integer> input = getInput();

	    if (input.get(0) == input.get(1)) {
            Print("Yes");
            return;
        }

	    Print("No");
    }

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Integer> getInput() {
        String in = scanner.nextLine();

        ArrayList<Integer> result = new ArrayList<>();
        for (String t : in.split(" ")) {
            result.add(Integer.parseInt(t));
        }

        return result;
    }

    private static void Print(Object o) {
        System.out.println(o);
    }
}
