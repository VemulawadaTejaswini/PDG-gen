package Main;

import java.util.*;;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int W=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int W=3;
		int a=2;
		int b=6;
		int z=Math.abs(a-b);
		if(z<=W) {
			z=0;
		}else{
			z=z-W;
		}
		System.out.println(z);


	}

}
