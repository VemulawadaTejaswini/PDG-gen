import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int start, goal, middle;
    	start = sc.nextInt();
    	goal = sc.nextInt();
    	middle = sc.nextInt();
    	
    	if ((start < middle && middle < goal) || (goal < middle && middle < start)) {
    		System.out.println("Yes");
    	} else {
    		System.out.println("No");
    	}
    	
    }

}