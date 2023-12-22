import java.util.Scanner;
import java.lang.Math;


public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static int num;
	static int edge[][] = new int[3][100];
	
	//mainÖ
	public static void main(String[] args) {
		read();
		solve();
	}

	//readÖ
	static boolean read(){
		if(sc.hasNextInt()){
			num = sc.nextInt();
		}
		for(int i=0; i<num; i++){
			for(int j=0; j<3; j++){
				if(sc.hasNextInt() == true){
					edge[j][i] = sc.nextInt();
				}
			}			
		}
		return true;
	}
	
	//solveÖ
	static void solve(){
		for(int i=0; i<num; i++){
			
			if(Math.pow(edge[0][i], 2) + Math.pow(edge[1][i], 2) == Math.pow(edge[2][i], 2)){
				System.out.println("YES");
				continue;
			} else if(Math.pow(edge[1][i], 2) + Math.pow(edge[2][i], 2) == Math.pow(edge[0][i], 2)){
				System.out.println("YES");
				continue;
			} else if(Math.pow(edge[2][i], 2) + Math.pow(edge[0][i], 2) == Math.pow(edge[1][i], 2)){
				System.out.println("YES");
				continue;
			} else{
				System.out.println("NO");
			}
			
		}      
	}
}