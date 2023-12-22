import java.util.Scanner;
public class Main {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c1 = sc.nextInt();
		int c5 = sc.nextInt()*5;
		int c10 = sc.nextInt()*10;
		int c50 = sc.nextInt()*50;
		int c100 = sc.nextInt()*100;
		int c500 = sc.nextInt()*500;
		if(c1+c5+c10+c50+c100+c500>=1000){
			System.out.println(1);
		}else{
			System.out.println(0);
		}
	}

}