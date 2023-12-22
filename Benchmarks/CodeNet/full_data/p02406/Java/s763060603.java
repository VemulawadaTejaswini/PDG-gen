import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			int x=0;
			if(i%3==0){
				x=i;
			}else if(i%10==3){
				x=i;
			}
			if(x!=0)
				System.out.print(" "+x);
		}
		System.out.println();
	}
}

