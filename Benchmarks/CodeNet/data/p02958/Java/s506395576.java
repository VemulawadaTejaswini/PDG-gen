import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc =new Scanner(System.in);
		
		int n=sc.nextInt();
		int p[]=new int[n];
		int c = 0;
		for(int i=0;i<n;i++) {
			p[i]=sc.nextInt();
			if(p[i]!=i+1)c+=1;
		}
		if(c<=2) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}

}
	
	
	
}



