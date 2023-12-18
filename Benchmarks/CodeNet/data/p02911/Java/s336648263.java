import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int q=sc.nextInt();
		int tokuten[]=new int[n];
		for(int i=0;i<n;i++) {
			tokuten[i]=k;
		}
		for(int i=0;i<q;i++) {
			int h=sc.nextInt();
			for(int j=0;j<n;j++) {
				if(j+1!=h)
					tokuten[j]--;
			}
		}
		for(int i=0;i<n;i++) {
			if(tokuten[i]>0) {
				System.out.println("Yse");
			}else {
				System.out.println("No");
			}
		}

	}

}
