import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);
        int sheeps = sc.nextInt();
        int wolves = sc.nextInt();
        System.out.println(sheeps <= wolves ? "unsafe" : "safe");
    }
}
