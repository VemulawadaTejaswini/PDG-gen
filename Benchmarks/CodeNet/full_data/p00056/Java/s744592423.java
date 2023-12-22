import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
	static Scanner sc=new Scanner(System.in);
	static PrintWriter pr=new PrintWriter(System.out);
	static int temp=50001;
	static boolean[] judge=new boolean[temp];
	static int[] ans=new int[temp];
	public static void main(String[] args) {
		judge[0]=judge[1]=true;
		for(int i=0;i<temp;i++){
			if(judge[i]) continue;
			for(int j=i*2;j<temp;j+=i)	judge[j] = true;
		}
		for(int i=0;i<temp;i++){
			if(judge[i]) continue;
			for(int j=i;i+j<temp;j++){
				if(judge[j])continue;
				ans[i+j]++;
			}
		}
		while(true){
			int n=sc.nextInt();
			if(n==0)break;
			pr.println(ans[n]);

		}
		pr.flush();
	}
}