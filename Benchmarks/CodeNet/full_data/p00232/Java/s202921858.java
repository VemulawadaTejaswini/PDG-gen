import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	int DP(int sai[],int road[],int X,int Y){
		double result = 0;
		double all[][] = new double [Y+1][5000]; 
		all[0][0] = 1;
		for(int i = 0;i < Y;i++){
			for(int j = 0;j < X;j++){
				for(int k = 0;k < 5000;k++){
					if(i + sai[j] < Y){
						if(road[i+sai[j]] > 100){
							if(i + sai[j] + road[i+sai[j]] - 100 > Y){
								all[Y][k] = all[Y][k] + (all[i][k]/X);
							}else{
								all[i+sai[j]+road[i+sai[j]]-100][k] = all[i+sai[j]+road[i+sai[j]]-100][k]+(all[i][k]/X);
							}
						}else{
							if(k + road[i+sai[j]]>0 && k + road[i+sai[j]] < 5000){
								all[i+sai[j]][k+road[i+sai[j]]] = all[i+sai[j]][k+road[i+sai[j]]] + (all[i][k]/X);
							}else{
								all[i+sai[j]][0] = all[i+sai[j]][0] + (all[i][k]/X);
							}
						}
					}else{
						all[Y][k] = all[Y][k] + (all[i][k]/X);
					}
				}
			}
		}
		for(int i = 0;i < 5000;i++){
			result = result + all[Y][i]*i;
		}
		return (int) result;
	}
	void doIt() {
		while(true){
			int X = sc.nextInt();
			int Y = sc.nextInt();
			int Z = sc.nextInt();
			if(X+Y+Z == 0)break;
			int sai[] = new int [X];
			int road[] = new int [Y+1];
			for(int i = 0;i < X;i++){
				sai[i] = sc.nextInt();
			}
			for(int i = 0;i < Z;i++){
				int N = sc.nextInt();
				int E = sc.nextInt();
				int A = sc.nextInt();
				if(E == 1){
					road[N] = A+100;
				}else if(E == 2){
					road[N] = A;
				}else if(E == 3){
					road[N] = -A;
				}
			}
			System.out.println(DP(sai,road,X,Y));
		}
     }
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	new Main().doIt();
    }
}