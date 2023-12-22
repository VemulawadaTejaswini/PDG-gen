import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int t = sc.nextInt();
        
        int sumNum = 0;
        int minTime = 0;
        
        while (n > sumNum) {
        	sumNum += x; 
        	minTime += t;
        }
        
        System.out.println(minTime);

    }
}