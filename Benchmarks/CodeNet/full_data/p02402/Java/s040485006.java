import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int min=10000;
		int max=0;
		int sum=0;
		for(int i=0;sc.hasNext();i++){
			a=sc.nextInt();
			sum+=a;
			if(a>min)min=a;
			else if(a<max)max=a;
			
		}sc.close();
			
		

	}
}