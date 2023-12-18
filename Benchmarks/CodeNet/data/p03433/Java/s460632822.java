import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int a =sc.nextInt();
			int b =sc.nextInt();
			int d =0;
			int flag =0;
			 			
			for(int i=0;i<b+1;i++)
			{
				d=a-i;
				
				if(d%500==0){
					flag=1;
				}
			}
			
			if(flag==1){
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
}