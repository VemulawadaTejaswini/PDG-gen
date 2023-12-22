import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		int i = 0;
		int x;
		while(true){
			Scanner sc = new Scanner(System.in);
			x = sc.nextInt();
			i++;
			if(x==0) break;
			System.out.println("Case "+i+": "+x);
		}
	}
}