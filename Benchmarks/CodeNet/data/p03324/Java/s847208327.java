import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			int D = sc.nextInt();
			int N = sc.nextInt();
			if(D==0&&N<100)System.out.println(N);
			if(D==0&&N==100)System.out.println(101);
			if(D==1&&N<100)System.out.println(100*N);
			if(D==1&&N==100)System.out.println(100*101);
			if(D==2&&N<100)System.out.println(10000*N);
			if(D==2&&N==100)System.out.println(10000*101);
	}
}