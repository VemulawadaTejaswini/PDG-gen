import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int M = sc.nextInt();
		ArrayList<Integer> ken = new ArrayList<Integer>();
		int [][] shi = new int[M][3];
		for(int i=0; i<M; i++){
			shi[i][0] = sc.nextInt();
			shi[i][1] = sc.nextInt();
			if(ken.indexOf(shi[i][0])==-1){
				ken.add(shi[i][0]);
			}
		}
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for(int i=0; i<ken.size(); i++){
			int k = ken.get(i);
			for(int j=0; j<M; j++){
				if(k==shi[j][0]){
					temp.add(shi[j][1]);
				}
			}
			Collections.sort(temp);
			for(int l=0; l<temp.size(); l++){
				for(int j=0; j<M;j ++){
					if(k==shi[j][0]){
						shi[j][2] = temp.indexOf(shi[j][1])+1;
					}
				}
			}
			temp.clear();

		}

		for(int i=0; i<M; i++){
			System.out.printf("%06d%06d",shi[i][0],shi[i][2]);
			System.out.print("\n");
		}

		sc.close();
	}
}
