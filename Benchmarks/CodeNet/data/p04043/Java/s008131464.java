import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int array [] = {sc.nextInt(),sc.nextInt(),sc.nextInt() };
        Arrays.sort(array);
        System.out.print((array[0] == 5) && (array[1] == 5) && (array[2] == 7) ? "Yes" : "No");

    }
}
