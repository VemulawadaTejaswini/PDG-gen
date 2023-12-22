import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int W = in.nextInt();
		int H = in.nextInt();
		int cnt = 0;
		int [] status = new int [2];
		int [] moveto = new int [2];
		int N = in.nextInt();
		for(int i = 0; i < N; i++){
			for(int k = 0; k < 2; k++){
				moveto[k] = in.nextInt();
			}
			if(i == 0){
				for(int k = 0; k < 2; k++){
					status[k] = moveto[k];
				}
				//System.out.println("スタート地点"+status[0]+","+status[1]);
			}
			else{
				int flg = 0;
				while(flg == 0){
					int compare = comp(moveto,status);
					switch (compare){
					case 0:
						status[0]--;
						cnt++;
						//System.out.println("1移動");
						//System.out.println("左に移動"+status[0]+","+status[1]);
						//System.out.println("移動目標"+moveto[0]+","+moveto[1]);
						break;
					case 1:
						status[0]--;
						status[1]--;
						cnt++;
						//System.out.println("1移動");
						//System.out.println("左下に移動"+status[0]+","+status[1]);
						//System.out.println("移動目標"+moveto[0]+","+moveto[1]);
						break;
					case 2:
						status[0]--;
						status[1]++;
						cnt += 2;
						//System.out.println("2移動");
						//System.out.println("左上に移動"+status[0]+","+status[1]);
						//System.out.println("移動目標"+moveto[0]+","+moveto[1]);
						break;
					case 3:
						flg++;
						break;
					case 4:
						status[1]--;
						cnt++;
						//System.out.println("1移動");
						//System.out.println("下に移動"+status[0]+","+status[1]);
						//System.out.println("移動目標"+moveto[0]+","+moveto[1]);
						break;
					case 5:
						status[1]++;
						cnt++;
						//System.out.println("1移動");
						//System.out.println("上に移動"+status[0]+","+status[1]);
						//System.out.println("移動目標"+moveto[0]+","+moveto[1]);
						break;
					case 6:
						status[0]++;
						//System.out.println("1移動");
						//System.out.println("右に移動"+status[0]+","+status[1]);
						//System.out.println("移動目標"+moveto[0]+","+moveto[1]);
						cnt++;
						break;
					case 7:
						status[0]++;
						status[1]--;
						//System.out.println("2移動");
						//System.out.println("右下に移動"+status[0]+","+status[1]);
						//System.out.println("移動目標"+moveto[0]+","+moveto[1]);
						cnt += 2;
						break;
					case 8:
						status[0]++;
						status[1]++;
						cnt++;
						//System.out.println("1移動");
						//System.out.println("右上に移動"+status[0]+","+status[1]);
						//System.out.println("移動目標"+moveto[0]+","+moveto[1]);
						break;
					}
				}
			}
		}
		System.out.println(cnt);
	}
	public static int comp(int after[], int before[]){
		int distx = after[0] - before[0];
		int disty = after[1] - before[1];
		if(distx < 0){
			if(disty == 0) return 0;
			else if(disty < 0) return 1;
			else return 2;
		}
		else if(distx == 0){
			if(disty == 0) return 3;
			else if(disty < 0) return 4;
			else return 5;
		}
		else{
			if(disty == 0) return 6;
			else if(disty < 0) return 7;
			else return 8;
		}
	}
}