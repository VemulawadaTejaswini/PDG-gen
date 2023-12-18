import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int cnt = 0;
    	for(int i=3; i>=0; i--) {
    		int answer = (int) (N/(Math.pow(10, i)));
    		N %= Math.pow(10, i);
    		if(answer == 2) {
    			cnt++;
    		}
    	}
	    System.out.println(cnt);
    }
}