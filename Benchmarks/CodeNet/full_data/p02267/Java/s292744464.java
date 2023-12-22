import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		boolean[] S=new boolean[1000000001];
		int n=scan.nextInt();
		int count=0;
		int x;
		for(int i=0;i<n;i++){
			x=scan.nextInt();
			S[x]=true;
		}
		int q=scan.nextInt();
		for(int i=0;i<q;i++){
			x=scan.nextInt();
			if(S[x]){
				count++;
			}
		}
		System.out.println(count);
		scan.close();
	}
}