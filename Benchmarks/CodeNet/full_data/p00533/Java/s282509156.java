import java.util.Scanner;
public class Main {
	int time;
	char[] hw;
	Scanner sc = new Scanner(System.in);

	void doit() {
		int ans[][] = new int[1000][1000];
		int h = sc.nextInt();
		int w = sc.nextInt();
		ctime(h, w, ans);

		//??????
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				if(j == w - 1){
					System.out.println(ans[i][j]);
				}else{
					System.out.print(ans[i][j]);
					System.out.print(" ");
				}
			}
		}
	}
	
	void ctime(int h, int w, int ans[][]){
		for(int i = 0; i < h; i++){
			char[] hw = sc.next().toCharArray();
			time = -1;
			for(int j = 0; j < w; j++){
				if(hw[j] == 'c'){
					time = 0;
				}
				ans[i][j] = time;
				if(time != -1){
					time++;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		new Main() . doit();

	}

}