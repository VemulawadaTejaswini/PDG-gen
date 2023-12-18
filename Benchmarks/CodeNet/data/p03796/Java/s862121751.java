import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int p=1,i;
		int n = sc.nextInt();
		for(i=0;i<n;i++){
			p=p*(i+1);
		}
		p=p%(1000000000+7);
		System.out.println(p);
	}
}