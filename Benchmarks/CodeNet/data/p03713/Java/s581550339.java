import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long H = (long)sc.nextInt();
		long W = (long)sc.nextInt();
		long h,w;
		if(H<=W){
			h = H;
			w = W;
		}else{
			h = W;
			w = H;
		}
		if(h%3==0 || w%3==0)
			System.out.println(0);
		else if(h%3==1 && w%3==1)
			System.out.println(h/2);
		else if((h%3==1 && w%3==2) || (h%3==2 && w%3 == 1))
			System.out.println(h/2);
		else
			System.out.println(h*4/5);
	}
}