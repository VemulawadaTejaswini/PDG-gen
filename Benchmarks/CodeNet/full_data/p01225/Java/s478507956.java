import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[][] cards=new int[3][9];
		int n=sc.nextInt();
		int[] num=new int[9];
		char[] color=new char[9];
		boolean win;
		for(int i=0;i<n;i++){
			win=true;
			for(int j=0;j<3;j++){
				for(int k=0;k<9;k++){
					cards[j][k]=0;
				}
			}
			for(int j=0;j<9;j++){
				num[j]=sc.nextInt();
			}
			for(int j=0;j<9;j++){
				color[j]=sc.next().charAt(0);
				switch(color[j]){
					case 'R':
						cards[0][num[j]-1]++;
						break;
					case 'G':
						cards[1][num[j]-1]++;
						break;
					case 'B':
						cards[2][num[j]-1]++;
						break;
				}
			}
			for(int j=0;j<3;j++){
				if(win==false){
					break;
				}
				for(int k=0;k<9;k++){
					if(cards[j][k]!=0){
						if(cards[j][k]==3){
							cards[j][k]=0;
						}
						else if(k<7){
							if(cards[j][k+1]>=cards[j][k]&&cards[j][k+2]>=cards[j][k]){
								cards[j][k+1]-=cards[j][k];
								cards[j][k+2]-=cards[j][k];
								cards[j][k]=0;
							}
							else{
								win=false;
								break;
							}
						}
						else{
							win=false;
							break;
						}
					}
				}
			}
			if(win){
				System.out.println(1);
			}
			else{
				System.out.println(0);
			}
		}
	}
}
