import java.util.Scanner;

public class Main {

	static int[][] field1,field2;
	static boolean[][][][] dp;
	static int sXL,sXR,sYL,sYR;
	static boolean ans;
	static int[] v1={0,1,0,-1};
	static int[] v2={1,0,-1,0};
	static int w,h;
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(true){

			w=cin.nextInt();
			h=cin.nextInt();
			if(w+h==0){
				return ;
			}
			ans=false;
			field1=new int[h][w];
			field2=new int[h][w];
			dp=new boolean[h][w][h][w];
			for(int i=0;i<h;i++){
				for(int j=0;j<2;j++){
					String s=cin.next();
					int[][] a;
					if(j==0){
						a=field1;
					}
					else{
						a=field2;
					}
					for(int k=0;k<s.length();k++){
						int b=0;
						if(s.charAt(k)=='%'){
							b=1;
						}
						else if(s.charAt(k)=='#'){
							b=-1;
						}
						else if(s.charAt(k)=='L'){
							sXL=i;
							sYL=k;
						}
						else if(s.charAt(k)=='R'){
							sXR=i;
							sYR=k;
						}
						a[i][k]=b;
					}
				}
			}
			bt(sXL,sYL,sXR,sYR);
			if(ans){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		}
	}
	static void bt(int a,int b,int c,int d){
//		System.out.println(a+" "+b+" "+c+" "+d);
		if(dp[a][b][c][d]||ans){
			return ;
		}
		dp[a][b][c][d]=true;
		if(field1[a][b]==1&&field2[c][d]==1){
			ans=true;
		}
		if(field1[a][b]==1){
			return;
		}
		if(field2[c][d]==1){
			return;
		}
		for(int i=0;i<4;i++){
			int aa=a+v1[i];
			int bb=b+v2[i];
			int cc=c+v1[i];
			int dd=d+-v2[i];
//			System.out.println(aa+" "+bb+" "+cc+" "+dd+" "+i);
			if(aa<0||aa>=h){
				aa-=v1[i];
			}
			if(bb<0||bb>=w){
				bb-=v2[i];
			}
			if(cc<0||cc>=h){
				cc-=v1[i];
			}
			if(dd<0||dd>=w){
				dd-=-v2[i];
			}
//			System.out.println(aa+" "+bb+" "+cc+" "+dd+" "+i);
			if(field1[aa][bb]==-1){
				aa-=v1[i];
				bb-=v2[i];
			}
			if(field2[cc][dd]==-1){
				cc-=v1[i];
				dd-=-v2[i];
			}
			bt(aa,bb,cc,dd);
		}
	}
}