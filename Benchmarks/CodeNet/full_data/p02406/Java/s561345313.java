import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		StringBuilder cout=new StringBuilder();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i=1;i<=n;i++){
			int x=n;
			if (x%3==0){
			 cout.append(" "+i);
			 continue;}
			while(x!=0){
				if (x%10==3){
					cout.append(" "+i);
					break;}
				x/=10;
			}
		}
		System.out.println(cout);
	}
}