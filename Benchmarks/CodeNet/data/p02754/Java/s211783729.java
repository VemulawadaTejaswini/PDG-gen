import java.util.*;

public class Main{
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int x,y,z = 0;
        for(int i = 0;i < N;i++) {
        	x = N / (A + B);
        	y = N % (A + B);
        	z = (A * x) + y;
        }
        if(A == 0) {
        	System.out.println("0");
        }else{
        	System.out.println(z);
        }
	}
}