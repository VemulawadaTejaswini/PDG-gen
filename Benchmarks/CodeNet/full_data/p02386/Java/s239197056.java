import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n;
		n=scan.nextInt();
		int i,j,dice1,dice2,dice[][]=new int[n][6],f=0,swap;
		for(i=0;i<n;i++){
			for(j=0;j<6;j++){
				dice[i][j]=scan.nextInt();
			}
		}
		for(dice1=0;dice1<n-1;dice1++){
			for(dice2=dice1+1;dice2<n;dice2++){
				for(i=0;i<=6;i++){
					if(dice[dice1][0]==dice[dice2][0]&&dice[dice1][5]==dice[dice2][5]){
						for(j=0;j<4;j++){
							if(dice[dice1][1]==dice[dice2][1]&&dice[dice1][2]==dice[dice2][2]&&dice[dice1][3]==dice[dice2][3]&&dice[dice1][4]==dice[dice2][4]){
								f=1;
								break;
							}
							swap=dice[dice2][1];
							dice[dice2][1]=dice[dice2][2];
							dice[dice2][2]=dice[dice2][4];
							dice[dice2][4]=dice[dice2][3];
							dice[dice2][3]=swap;
						}
					}
					if(i%2==0){
						swap=dice[dice2][0];
						dice[dice2][0]=dice[dice2][1];
						dice[dice2][1]=dice[dice2][5];
						dice[dice2][5]=dice[dice2][4];
						dice[dice2][4]=swap;
					}

					else{
						swap=dice[dice2][0];
						dice[dice2][0]=dice[dice2][3];
						dice[dice2][3]=dice[dice2][5];
						dice[dice2][5]=dice[dice2][2];
						dice[dice2][2]=swap;
						
					}
					if(f==1){
						break;
					}
				}
				if(f==1){
					break;
				}
			}
			if(f==1){
				break;
			}
		}
		if(f>=1){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
	}
}
