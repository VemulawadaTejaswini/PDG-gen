import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int A[][]=new int[3][3];
		boolean cout[][]=new boolean[3][3];
		boolean key=true;
		int ans=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				A[i][j]=stdIn.nextInt();
			}
		}
		int N=stdIn.nextInt();
		for(int i=0;i<N;i++){
			int b=stdIn.nextInt();
			for(int k=0;k<3;k++){
				for(int j=0;j<3;j++){
					if(A[k][j]==b)
						cout[k][j]=true;
				}
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(cout[i][j]==false)
					key=false;
			}
			if(key){
				System.out.println("Yes");
				System.exit(0);
			}
			key=true;
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(cout[j][i]==false)
					key=false;
			}
			if(key){
				System.out.println("Yes");
				System.exit(0);
			}
			key=true;
		}
		if(cout[0][0]&&cout[1][1]&&cout[2][2]){
			System.out.println("Yes");
			System.exit(0);
		}
		if(cout[0][2]&&cout[1][1]&&cout[2][0]){
			System.out.println("Yes");
			System.exit(0);
		}
		System.out.println("No");
	}
}
