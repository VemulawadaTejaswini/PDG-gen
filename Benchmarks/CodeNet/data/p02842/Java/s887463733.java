import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);
        int ans=0;

        double N = stdin.nextInt();
        
        for(int i=0;i<=50000;i++) {
        	if(Math.floor(i*1.08) == N) {
        		System.out.println(i);
        		break;
        	}
        	else if(i==5000) System.out.print(":(");
        }
	}
}
