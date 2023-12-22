import java.util.Scanner;
public class Main{
	static char bombs[][]=new char[8][8];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String s[]=new String[8];
		int x,y;
		for(int i=1;i<=n;i++){
			for(int j=0;j<8;j++){
				s[j]=sc.next();
				for(int k=0;k<8;k++){
					bombs[j][k]=s[j].charAt(k);
				}
			}
			x=sc.nextInt()-1;
			y=sc.nextInt()-1;
			dfs(y, x);
			System.out.println("Data "+i+":");
			for(int j=0;j<8;j++){
				for(int k=0;k<8;k++){
					System.out.print(bombs[j][k]);
				}
				System.out.println();
			}
		}
	}
	private static void dfs(int y, int x){
		int x_c[]={1,0,-1,0,2,0,-2,0,3,0,-3,0};
		int y_c[]={0,1,0,-1,0,2,0,-2,0,3,0,-3};
		for(int i=0;i<12;i++){
			bombs[y][x]='0';
			if(x+x_c[i]>=0&&y+y_c[i]>=0&&x+x_c[i]<8&&y+y_c[i]<8&&bombs[y+y_c[i]][x+x_c[i]]=='1'){
				dfs(y+y_c[i], x+x_c[i]);
			}
		}
	}
}