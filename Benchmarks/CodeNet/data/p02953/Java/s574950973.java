
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ここにコードを挿入
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
	
		int h[]=new int[n];
		String answer=null;
		for(int i=0;i<n;i++) {
			h[i]=sc.nextInt();
			if(h[i+1]+2<=h[i]) {
				answer="No";
				break;
			}else if(h[i]>h[i+1]&&h[i+1]>h[i+2]) {
				answer="No";
				break;
			}else if(h[i]==h[i+1]&&h[i+1]>h[i+2]) {
				answer="No";
				break;
			}else {
				answer="Yes";
			}
		}
		System.out.println(answer);
	    }
}