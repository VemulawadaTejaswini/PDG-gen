import java.util.*;
class Main{
	static int h=0;
	static int w=0;
	static int map[][];
	static int ct=0;
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		while(true){
			w=s.nextInt();h=s.nextInt();if(h==0&&w==0){break;}map=new int[h+2][w+2];
			for(int i=1;i<=h;i++){
			for(int j=1;j<=w;j++){
			map[i][j]=s.nextInt();
			}}	//forfor
					for(int k=0;k<=h+1;k++){map[k][0]=map[k][w+1]=0;}
					for(int l=0;l<=w+1;l++){map[0][l]=map[h+1][l]=0;}ct=1;
						for(int ph=1;ph<=h;ph++){
							for(int pw=1;pw<=w;pw++){
								if(map[ph][pw]==1){
										ct++;
										calc(ph,pw);
								}//if
							
							}}//forfor2
					System.out.println(ct-1);
			
		}}//while and main method
	public static int calc(int column,int row){
				map[column][row]=ct;
				for(int h=-1;h<=1;h++){
				for(int w=-1;w<=1;w++){
					if(map[column+h][row+w]==1){
						calc(column+h,row+w);}//if
				}}
				return 0;}//calc
}//class