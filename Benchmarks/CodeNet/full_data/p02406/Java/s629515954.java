import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner n=new Scanner(System.in);
		int a=n.nextInt();
		int c=0;
		for (int b=1;b<=a;b++){
			c++;
			if (c%3==0){
				System.out.print(" "+b);
			}else if(c%10==3){
				System.out.print(" "+b);
			}
			if (c>10){
				int d=c/10;
				if (d%3==0){
					System.out.print(" "+b);
				}else if(d%10==3){
					System.out.print(" "+b);
				}
				
			}
			
		}
		System.out.println();
	}
}