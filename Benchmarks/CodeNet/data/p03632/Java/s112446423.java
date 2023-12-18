
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        if (A <= C) {
        	int time = Math.max(0, B-C-A);
        	System.out.println(time <= D ? time : D);
        } else {
        	int time = Math.max(0, D-A-C);
        	System.out.println(time <= B ? time : B);
        }
    }
}


