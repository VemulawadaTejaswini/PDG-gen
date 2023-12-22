import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[] traffic;
	static int n,m;
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
		m = sc.nextInt();
		
		if(n == 0 && m == 0)
		return false;
		
		traffic = new int[n+m];
		for(int i = 0; i < n; i++){
			traffic[i] = sc.nextInt();
		}
		for(int i = n; i < n+m; i++){
			traffic[i] = sc.nextInt();
		}
		return true;
	}
	static void slove(){
		/*for(int i = 0; i < n+m; i++){
			System.out.println(traffic[i]);
		}*/
		java.util.Arrays.sort(traffic);
		int max = 0;
		int defference;
		
		for(int i = 1; i < n+m; i++){	
			defference = traffic[i] - traffic[i-1];
			max = Math.max(max, defference);
		}
		if(n+m == 1)
			max = traffic[0];
		
		System.out.println(max);
	}

}