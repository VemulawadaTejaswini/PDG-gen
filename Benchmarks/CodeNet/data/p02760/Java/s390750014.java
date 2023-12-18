import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int A[][]=new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				A[i][j]=sc.nextInt();
			}
		}
		
		int N=sc.nextInt();
		int[] b=new int[N];
		
		for(int i=0;i<N;i++)
			b[i]=sc.nextInt();
		
		boolean[][]	hole=new boolean[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
				hole[i][j]=false;
				
				for(int k=0;k<N;k++) {
					if(A[i][j]==b[k])
						hole[i][j]=true;
				}
			}
		}
		
		String ans="No";
		
		for(int i=0;i<3;i++) {
			if(hole[i][0]==true&&hole[i][0]==hole[i][1]==hole[i][2])
				ans="Yes";
			if(hole[0][i]==true&&hole[0][i]==hole[1][i]==hole[2][i])
				ans="Yes";
		}
		
		if(hole[0][0]==true&&hole[0][0]==hole[1][1]==hole[2][2])
			ans="Yes";
		if(hole[0][2]==true&&hole[0][2]==hole[1][1]==hole[2][0])
			ans="Yes";
		
		System.out.println(ans);
		
		sc.close();
	}
}