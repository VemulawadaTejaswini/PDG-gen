import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N,Y;
		N=sc.nextInt();
		Y=sc.nextInt();
		boolean flag=false;
		for(int a=0;a<N;a++) {
			for(int b=0;b<N-a;b++) {
				int c=N-a-b;
				int total=a*1000+b*5000+c*10000;
				if(total==Y) {
					System.out.println(c+" "+b+" "+a);
					flag=true;
					break;
				}
				
			}
			
		}
		if(!flag) {
			System.out.println("-1 -1 -1");
		}
		
	}

}
