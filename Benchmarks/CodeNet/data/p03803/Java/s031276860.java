 import java.util.Scanner;
     
    public class Main {
     
    	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		int A = sc.nextInt();
    		int B = sc.nextInt();
    		if (A==B) {
    			System.out.println("Draw");
    		} else if (A==1&&B==13) {
    			System.out.println("Alice");
    		} else if (A==13&&B==1) {
    			System.out.println("Bob");
    		} else if (A<B) {
    			System.out.println("Bob");
    		} else {
    			System.out.println("Alice");
    		}
    	}
    }