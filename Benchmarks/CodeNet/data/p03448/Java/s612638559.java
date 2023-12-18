
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int coin_500=sc.nextInt();
		int coin_100=sc.nextInt();
		int coin_50=sc.nextInt();
		int total=sc.nextInt();
		int num=0;
		for(int a=0;a<=coin_500;a++){
			for(int b=0;b<=coin_100;b++){
				for(int c=0;c<=coin_50;c++){
					if(a*500+b*100+c*50==total){
						num++;
					}
				}
			}
		}
		System.out.println(num);
	}
}
