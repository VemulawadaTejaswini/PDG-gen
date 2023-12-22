import java.util.Scanner;
public class Main{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			int K=sc.nextInt();
			int p=sc.nextInt();
			int count=0;
			for(int j=0;j<K;j++){
				if(count==p)count=0;
				count++;
				
			}
			System.out.println(count);
		}
		
	}
}