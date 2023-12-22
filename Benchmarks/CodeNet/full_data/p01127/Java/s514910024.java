import java.util.Scanner;

public class Main {

	static int h,w;
	static int minx,miny,maxx,maxy;
	static int[][] field,alpha;
	static int[] v1={1,0,-1,0};
	static int[] v2={0,-1,0,1};
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		label2:for(int T=cin.nextInt();T--!=0;){
			h=cin.nextInt();	
			w=cin.nextInt();
			field=new int[h][w];
			
			for(int i=0;i<h;i++){
				char[] s=cin.next().toCharArray();
				for(int j=0;j<w;j++){
					if(s[j]=='.')
						continue;
					field[i][j]=s[j];
//					System.out.println(field[i][j]);
				}
			}
			boolean ans=true;
			label:while(true){
				alpha=new int[26][4];
				ans=true;
				boolean canBreak=true;
				for(int i=0;i<26;i++){
					alpha[i][0]=alpha[i][1]=1<<30;
					alpha[i][2]=alpha[i][3]=-1;
				}
				for(int i=0;i<h;i++){
					for(int j=0;j<w;j++){
						if(field[i][j]>0){
							alpha[field[i][j]-'A'][0]=Math.min(i, alpha[field[i][j]-'A'][0]);
							alpha[field[i][j]-'A'][1]=Math.min(j, alpha[field[i][j]-'A'][1]);
							alpha[field[i][j]-'A'][2]=Math.max(i, alpha[field[i][j]-'A'][2]);
							alpha[field[i][j]-'A'][3]=Math.max(j, alpha[field[i][j]-'A'][3]);
//							System.out.println(alpha[field[i][j]-'A'][0]=Math.min(i, alpha[field[i][j]-'A'][0]));
						}
					}
				}
				for(int k=0;k<26;k++){
					if(alpha[k][0]==1<<30){
//						System.out.println((char)(k+'A'));
						continue;
					}
					int color='A'+k;
					boolean f=true;
					for(int i=alpha[k][0];i<=alpha[k][2];i++){
//						System.out.println(color);
						for(int j=alpha[k][1];j<=alpha[k][3];j++){
//							System.out.print(field[i][j]+" ");
							if(color==field[i][j]||field[i][j]==-1){
							}
							else{
								f=false;
							}
						}
//						System.out.println();
					}
					if(f){
						canBreak=false;
						for(int i=alpha[k][0];i<=alpha[k][2];i++){
							for(int j=alpha[k][1];j<=alpha[k][3];j++){
								field[i][j]=-1;
							}
						}
					}
				}
//				output();
				if(canBreak){
					break;
				}
			}
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					if(field[i][j]>0){
						System.out.println("SUSPICIOUS");
						continue label2;
					}
				}
			}
			System.out.println("SAFE");
		}
	}
	static void output(){
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				if(field[i][j]<=0){
					System.out.print(".");
				}
				else{
					System.out.print((char)field[i][j]);
				}
			}
			System.out.println();
		}
	}
	static void c(){
		for(int i=miny;i<=maxy;i++){
			for(int j=minx;j<=maxx;j++){
				field[i][j]=-1;
			}
		}
	}
	static boolean b(int color){
		for(int i=miny;i<=maxy;i++){
			for(int j=minx;j<=maxx;j++){
				if(field[i][j]!=color)return false;
			}
		}
		return true;
	}
}