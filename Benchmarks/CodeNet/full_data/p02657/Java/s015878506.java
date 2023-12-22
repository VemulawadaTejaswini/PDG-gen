import java.util.*;

public class Main {
    public static void main(String[] args) {
		String first = new Scanner(System.in).nextLine();
		String Array[] = first.split(" ");
		int Num0 = Integer.parseInt(Array[0]);
		int Num1 = Integer.parseInt(Array[1]);
		System.out.println(Num0 * Num1);
		
    }
}