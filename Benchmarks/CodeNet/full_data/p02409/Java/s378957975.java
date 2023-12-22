import java.util.Scanner;
public class Main {
	private static final int MAX_B=4;
	private static final int MAX_F=3;
	private static final int MAX_R=10;
	private static Scanner sc=new Scanner(System.in);
	private static int n=sc.nextInt();
	private static int[][][] room=new int[MAX_B][MAX_F][MAX_R];
	public static void main(String[] args){
		for(int i=0;i<MAX_B;i++){
			for(int j=0;j<MAX_F;j++){
				for(int k=0;k<MAX_R;k++){
					room[i][j][k]=0;
				}
			}
		}
		int b,f,r,v;
		for(int i=0;i<n;i++){
			b=sc.nextInt();
			f=sc.nextInt();
			r=sc.nextInt();
			v=sc.nextInt();
			room[b-1][f-1][r-1]+=v;
		}
		for(int i=0;i<MAX_B-1;i++){
			for(int j=0;j<MAX_F;j++){
				for(int k=0;k<MAX_R;k++){
					System.out.print(" "+room[i][j][k]);
				}
				System.out.println("");
			}
			System.out.println("####################");
		}
		for(int j=0;j<MAX_F;j++){
			for(int k=0;k<MAX_R;k++){
				System.out.print(" "+room[3][j][k]);
			}
			System.out.println("");
		}
	}
}