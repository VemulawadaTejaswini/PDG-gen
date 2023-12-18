import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] ratio = new int[n][2];
		int t = 0;
		int a = 0;
		int k=0;
		int tmp = 0;
		for (int i=0;i<n;i++){
			ratio[i][0] = sc.nextInt();
			ratio[i][1] = sc.nextInt();
		}
		for (int i=0;i<n;i++){
			if (i==0){
				t = ratio[0][0];
				a = ratio[0][1];
			}
			else{
				if (ratio[i][0]==1&&ratio[i][1]==1){
					if (t>a){
						a = t;
					}
					else{
						t = a;
					}
				}
				else{
					if(ratio[i][0]>=t&&ratio[i][1]>=a){
						t = ratio[i][0];
						a = ratio[i][1];
					}
					else if(ratio[i][0]>=t&&ratio[i][1]<a){
						k = (int)Math.ceil((double)a/(double)ratio[i][1]);
						t = (ratio[i][0])*k;
						a = (ratio[i][1])*k;
					}
					else if(ratio[i][0]<t&&ratio[i][1]>=a){
						k = (int)Math.ceil((double)t/(double)ratio[i][0]);
						t = (ratio[i][0])*k;
						a = (ratio[i][1])*k;
					}
					else if(ratio[i][0]<t&&ratio[i][1]<a){
						if((int)Math.ceil((double)t/(double)ratio[i][0])<(int)Math.ceil((double)a/(double)ratio[i][1])){
							k = (int)Math.ceil((double)a/(double)ratio[i][1]);
						} 
						else{
							k = (int)Math.ceil((double)t/(double)ratio[i][0]);
						}
						 t = ratio[i][0]*k;
						 a = ratio[i][1]*k;
						
					}
				}
			}
		}
		System.out.println(a+t);
	}

}
