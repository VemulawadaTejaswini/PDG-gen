import java.util.Scanner;

public class Main{
	
	static boolean is_same(int[][] dic,int n){
		int count;
		for(int i=1;i<n;i++){
			count=0;
			for(int j=0;j<6;j++){
				if(dic[0][j]==dic[i][j]){
					count++;
				}
			}
			if(count==6){
				return false;
			}
		}
		return true;
	}

	static void exchange(int[][] dic,int n){
		for(int i=0;i<n;i++){
			int tmp;
			if(dic[0][1]==dic[i][5]){
				tmp=dic[i][1];
				dic[i][1]=dic[i][5];
				dic[i][5]=dic[i][4];
				dic[i][4]=dic[i][0];
				dic[i][0]=tmp;
			}
			if(dic[0][1]==dic[i][3]){
				tmp=dic[i][1];
				dic[i][1]=dic[i][3];
				dic[i][3]=dic[i][4];
				dic[i][4]=dic[i][2];
				dic[i][2]=tmp;
			}
			if(dic[0][1]==dic[i][0]){
				tmp=dic[i][1];
				dic[i][1]=dic[i][0];
				dic[i][0]=dic[i][4];
				dic[i][4]=dic[i][5];
				dic[i][5]=tmp;
			}
			if(dic[0][1]==dic[i][2]){
				tmp=dic[i][1];
				dic[i][1]=dic[i][2];
				dic[i][2]=dic[i][4];
				dic[i][4]=dic[i][3];
				dic[i][3]=tmp;
			}
			if(dic[0][1]==dic[i][4]){
				tmp=dic[i][1];
				dic[i][1]=dic[i][4];
				dic[i][4]=tmp;
				tmp=dic[i][3];
				dic[i][3]=dic[i][2];
				dic[i][2]=tmp;
			}

			if(dic[i][2]==dic[0][5]||dic[i][5]==dic[0][5]||dic[i][3]==dic[0][5]||dic[i][0]==dic[0][5]){
				if(dic[i][5]==dic[0][5]){
				}else if(dic[i][3]==dic[0][5]){
					tmp=dic[i][3];
					dic[i][3]=dic[i][0];
					dic[i][0]=dic[i][2];
					dic[i][2]=dic[i][5];
					dic[i][5]=tmp;
				}else if(dic[i][0]==dic[0][5]){
					tmp=dic[i][0];
					dic[i][0]=dic[i][5];
					dic[i][5]=tmp;
					tmp=dic[i][3];
					dic[i][3]=dic[i][2];
					dic[i][2]=tmp;
				}else{
					tmp=dic[i][2];
					dic[i][2]=dic[i][0];
					dic[i][0]=dic[i][3];
					dic[i][3]=dic[i][5];
					dic[i][5]=tmp;
				}
			}else{
			}
		}
	}

	static void judge(int[] dic1,int[] dic2){
		for(int i=0;i<6;i++){
			if(dic1[i]!=dic2[i]){
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();//サイコロ数。

		int[][] dic=new int[n][6];

		for(int i=0;i<n;i++){
			for(int j=0;j<6;j++){
				dic[i][j]=scan.nextInt();
			}
		}

		exchange(dic,n);
		if(is_same(dic,n)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}


		scan.close();
	}
}