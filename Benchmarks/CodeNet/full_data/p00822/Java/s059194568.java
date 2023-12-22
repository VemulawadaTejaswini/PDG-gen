import java.util.Scanner;
import java.util.Stack;

public class Main {

	
	//　日数、雲の場所、左上の降ってない日数、右上、左下、右下
	static int n;
	static byte[][][][][][] dp;
	static byte[][] field;
	static byte[] v1={-8,-4,-1,-2,1,2,4,8,0};
	static byte[] v2={0,1,4,5};
	static byte[] pos={0,0,1,2,0,3,4,5,0,6,7,8,0,0,0,0,0};
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		for(;;){
			n=cin.nextInt();
			if(n==0)break;
			field = new byte[n][17];
			for(int i=0;i<n;i++){
				for(int j=1;j<17;j++){
					field[i][j]=cin.nextByte();
				}
			}
			dp=new byte[n][9][7][7][7][7];
			for(int i=0;i<n;i++){
				for(int j=0;j<9;j++){
					for(int k=0;k<7;k++){
						for(int l=0;l<7;l++){
							for(int m=0;m<7;m++){
								for(int nn=0;nn<7;nn++){
									dp[i][j][k][l][m][nn]=30;
								}
							}
						}
					}
				}
				
			}
//			output();
			if(isOkay(0,6)){
				System.out.println(dp((byte)0,(byte)6,(byte)0,(byte)0,(byte)0,(byte)0));
			}
			else{
				System.out.println("0");
			}
			
			
		}
	}
	// lt:lefttop rb rightbottom
	static byte dp(int m,byte position,byte lt,byte rt,byte lb,byte rb){
		if(lt>6||rt>6||lb>6||rb>6){
			return 0;
		}
		if(m==n){
			return 1;
		}


		if(!isOkay(m,position)){
			return 0;
		}
//		System.out.println(position+" "+pos[position]);
		if(dp[m][pos[position]][lt][rt][lb][rb]!=30)return dp[m][pos[position]][lt][rt][lb][rb];
//		if(dp[m][position][lt][rt][lb][rb]!=1<<30)return dp[m][position][lt][rt][lb][rb];
		byte re=0;
		for(int i=0;i<v1.length;i++){
			byte pp=move(position,v1[i]);
			if(pp<=0||pp>=12){
//				System.out.println("  gai "+pp);
				continue;
			}
			byte[] a = rain(pp,lt,rt,lb,rb);
			re=(byte) Math.max(re,
					dp((m+1),(byte)pp,a[0],a[1],a[2],a[3])
					);
		}
		return dp[m][pos[position]][lt][rt][lb][rb]=re;
	}
	static byte move(byte position,byte a){
		byte re = (byte)((byte)position+(byte)a);
		if(position==1){
			if(a < 0)return -1;
		}
		else if(position==2){
			if(a==2)return -1;
			if(a<-1)return -1;
		}
		else if(position==3){
			if(a==1||a==2)return -1;
		}
		else if(position==5){
			if(a==-2)return -1;
		}
		else if(position==6){
			
		}
		else if(position==7){
			if(a==2)return -1;
		}
		else if(position==9){
			if(a==-2)return -1;
		}
		else if(position==10){
			
		}
		else if(position==11){
			
		}
		return re;
	}
	static boolean isOkay(int m,int position){
		if(position==0||position==4||position==8||position>=12){
			return false;
		}
		/*
		for(int j=1;j<17;j++){
			if((j-1)%4==0)System.out.println();
			System.out.print(field[m][j]+" ");
		}
		System.out.println();
		*/
		for(int i=0;i<4;i++){
			int pp=position+v2[i];
			if(field[m][pp]==1)return false;
		}
		return true;
	}
	static byte[] rain(int position,byte lt,byte rt,byte lb,byte rb){
		lt++;
		rt++;
		lb++;
		rb++;
		if(position==1){
			lt=0;
		}
		else if(position==3){
			rt=0;
		}
		else if(position==9){
			lb=0;
		}
		else if(position==11){
			rb=0;
		}
		return new byte[]{lt,rt,lb,rb}; 
	}
	static void output(){
		for(int i=0;i<n;i++){
			for(int j=1;j<17;j++){
				if((j-1)%4==0)System.out.println();
				System.out.print(field[i][j]+" ");
			}
			System.out.println();
		}
	}
}