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
				field[y][x]=field[z][x]=1;
			}
			for(int i = 1000;i>=0;i--){
				if(field[a][i]==1){
					if(field[a-1][i]==1){
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