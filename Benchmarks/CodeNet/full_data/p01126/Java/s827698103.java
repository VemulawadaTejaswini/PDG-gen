import java.util.Scanner;
class Main{
	static Scanner sc;
	static int a,n,m,HPQ[][],nowX,nowY,stY;
	public static void main(String[]args){
		sc=new Scanner(System.in);
		while(true){
			n=sc.nextInt();
			m=sc.nextInt();
			a=sc.nextInt();
			if(n==0 && m==0 && a==0){break;}
			HPQ=new int[n][3];
			for(int i=0;i<n;i++){
				HPQ[i][0]=sc.nextInt();
				HPQ[i][1]=sc.nextInt();
				HPQ[i][2]=sc.nextInt();
			}
			nowX=a;
			nowY=0;
			for(int i=0;i<m;i++){
				if(nowY<HPQ[i][0]){
					nowY=HPQ[i][0];
				}
			}
			stY=nowY;
			while(nowY>0){
				for(int i=stY;i>=0;i--){
					if(nowY==HPQ[i][0] && nowX==HPQ[i][1]){
						nowX=HPQ[i][2];
					}else if(nowY==HPQ[i][0] && nowX==HPQ[i][2]){
						nowX=HPQ[i][1];
					}
				}
				nowY--;
			}
			System.out.println(nowX);
		}
	}
}