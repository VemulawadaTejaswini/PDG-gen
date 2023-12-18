import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int num = scan.nextInt();
			
			int b = num/100;
			int s = num/10%10;
			int g = num%10;
			
			if((g*100+s*10+b)==num){
				System.out.println("Yes");
			}
			else{
				System.out.println("NO");
				System.out.println(g+""+s+""+b);
			}
		}
	}
}