import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int i,j;
		int max=0;
		int k=x/500;
		int l=x/5;
		
		for(i=0;i<=k;++i) {
			for(j=0;j<=l/2;++j) {
				if(x-500*i-5*j>=0 && max<(1000*i)+(5*j)){
					max=1000*i+5*j;
				}
			}
		}
		System.out.println(max);
	}

}