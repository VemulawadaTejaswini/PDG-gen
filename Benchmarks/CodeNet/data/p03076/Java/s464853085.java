import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);       
		int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int ans = a+b+c+d+e;
        int A =10-a%10;if(A==10){A=0;}
        int B =10-b%10;if(B==10){B=0;}
        int C =10-c%10;if(C==10){C=0;}
        int D =10-d%10;if(D==10){D=0;}
        int E =10-e%10;if(E==10){E=0;}
        ans+=A+B+C+D+E;
        ans-=Math.max(A,Math.max(B,Math.max(C,Math.max(D,E))));
		System.out.println(ans);
  }
}
