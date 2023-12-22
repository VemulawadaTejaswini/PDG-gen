import java.util.*;

class Main {
	static Scanner sc =new Scanner(System.in);
	static int a;
	static int b;
	static int c;
    static int [] x;
		public static void main (String[]agrs){
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			int[]x=new int[]{a,b,c};
			
			Arrays.sort(x);
			for(int i = 0;i<x.length;i++){
				System.out.print(x[i]);
				if(i<2){
					System.out.print(" ");
				}
			}
			System.out.println();
		}
}