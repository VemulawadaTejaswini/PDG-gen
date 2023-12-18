import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int a=N/100;
		int b=(N%100)/10;
		int c=N-(a*100+b*10);
		String ans="No";
		if(a==7||b==7||c==7){
			ans="Yes";
		}
		System.out.println(ans);

	}

}
