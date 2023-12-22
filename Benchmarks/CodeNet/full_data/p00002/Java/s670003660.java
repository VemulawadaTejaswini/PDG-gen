import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()){
			int a=sc.nextInt();
			int b=sc.nextInt();
			double c=a+b;
			int cnt=0;
			while(c>=1){
				c=c/10;
				cnt++;
			}
			System.out.println(cnt);
		}
		sc.close();
	}
}