import java.util.Scanner;
class Main{
	static Scanner sc;
	static boolean ISCHK[][];
	static int num,STATE[][];
	public static void main(String[]args){
		sc=new Scanner(System.in);
		ISCHK=new boolean[14][14];
		STATE=new int[14][14];
		String tmpstr=new String("");
		while(sc.hasNext()){
			num=0;
			for(int i=0;i<14;i++){
				if(i>0 && i<13){tmpstr=sc.next();}
				for(int j=0;j<14;j++){
					if(i>0 && i<13){
						if(j==0||j==13){
							STATE[i][j]=0;
							ISCHK[i][j]=true;
						}else if(j<13){
							ISCHK[i][j]=false;
							STATE[i][j]=Integer.parseInt(tmpstr.substring(j-1,j));
						}
					}else{
							STATE[i][j]=0;
							ISCHK[i][j]=true;
					}
				}
			}
			for(int i=1;i<13;i++){
				for(int j=1;j<13;j++){
					if(ISCHK[i][j]==false){
						if(STATE[i][j]==0){
							ISCHK[i][j]=true;
						}else{
							ISCHK[i][j]=true;
							num++;
							srch(i,j);
						}
					}
				}
			}
			System.out.println(num);
		}
	}
	static void srch(int nowX,int nowY){
		if(ISCHK[nowX-1][nowY]==false && STATE[nowX-1][nowY]==1){
			ISCHK[nowX-1][nowY]=true;
			srch(nowX-1,nowY);
		}
		if(ISCHK[nowX][nowY-1]==false && STATE[nowX][nowY-1]==1){
			ISCHK[nowX][nowY-1]=true;
			srch(nowX,nowY-1);
		}
		if(ISCHK[nowX+1][nowY]==false && STATE[nowX+1][nowY]==1){
			ISCHK[nowX+1][nowY]=true;
			srch(nowX+1,nowY);
		}
		if(ISCHK[nowX][nowY+1]==false && STATE[nowX][nowY+1]==1){
			ISCHK[nowX][nowY+1]=true;
			srch(nowX,nowY+1);
		}
	}
}