import java.util.Scanner;

public class Main {

	static int n,m,a;
	static int[][] field;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			n=cin.nextInt();
			m=cin.nextInt();
			a=cin.nextInt();
			if(n+m+a==0){
				break;
			}
			field=new int[n+2][1001];
			for(int i = 0;i<m;i++){
				int x = cin.nextInt();
				int y = cin.nextInt();
				int z = cin.nextInt();
				field[y][x]=field[z][x]=i+1;
			}
			for(int i = 0;i<1001;i++){
				for(int j = 0;j<n+2;j++){
					System.out.print(field[j][i]+  " ");
					
				}
				System.out.println();
			}
			for(int i = 1000;i>=0;i--){
				if(field[a][i]>0){
					if(field[a-1][i]==field[a][i]){
						a--;
					}
					else{
						a++;
					}
				}
			}
			System.out.println(a);
		}

	}

}