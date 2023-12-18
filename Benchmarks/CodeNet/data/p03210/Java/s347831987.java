import java.util.Random;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand=new Random();
		int ans=rand.nextInt(3);
		int a=scan.nextInt();
		if(ans==0||ans==1) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
	}