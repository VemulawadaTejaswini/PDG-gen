import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
        int D = sc.nextInt();
      int R = 0;
      while(A > 0 && C > 0){
        if(R % 2 == 0)
          C -= B;
        else
          A -= D;
        R++;
      }
        if(A <= 0)
			System.out.println("No");
        else
          System.out.println("Yes");
	}
}