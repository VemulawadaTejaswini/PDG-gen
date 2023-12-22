import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n, math, English, Japanese;
	static int[][] info;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
		while(read()){
			slove();
		}
	}
	static boolean read(){
		n = sc.nextInt();
		if(n == 0)
			return false;
		
		info = new int[n][3];
		for(int i = 0; i<n; i++){
			for(int j = 0; j<3; j++){
				info[i][j] = sc.nextInt();
			}
		}
		return true;
	}
	static void slove(){
		for(int i = 0; i < n; i++){
			math = info[i][0];
			English = info[i][1];
			Japanese = info[i][2];
			if(math == 100 || English == 100 ||
					Japanese == 100){
				System.out.println("A");
			}else if((math+English)/2 >= 90){
				System.out.println("A");
			}else if((math+English+Japanese)/3 >= 80){
				System.out.println("A");
			}else if((math+English+Japanese)/3 >= 70){
				System.out.println("B");
			}else if((math+English+Japanese)/3 >= 50 
					&& (math >= 80 || English >= 80)){
				System.out.println("B");
			}else{
				System.out.println("C");
			}
			
		}
	}

}