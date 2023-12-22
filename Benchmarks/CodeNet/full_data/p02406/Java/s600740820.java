import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner n=new Scanner(System.in);
		int a=n.nextInt();
		for (int b=1;b<=a;b++){
			int c=b;
			if (c % 3 !=0 && c % 10 != 3){
				continue;
			}
			System.out.print(" "+c);
			c /= 10;
			c++;
		}
		System.out.println();
	}
}