import java.util.Scanner;

public class Main {

	static int n,p;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			n=cin.nextInt();
			p=cin.nextInt();
			int pp=p;
			if(n+p==0)break;
			int ans=0;
			int[] person=new int[n];
			int idx=0;
			while(true){
				if(p==0){
					p=person[idx];
					person[idx]=0;
				}
				else{
					p--;
					person[idx]++;
				}
				if(person[idx]==pp){
					ans=idx;
					break;
				}
				idx=(idx+1)%n;
				ans++;
			}
			System.out.println(ans);
		}
			

	}

}