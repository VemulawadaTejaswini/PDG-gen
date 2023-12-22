import java.util.Scanner;


public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static int n, m;
	public static int[] taro;
	public static int[] hanako;
	
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}

	public static boolean read(){
		n = sc.nextInt();
		m = sc.nextInt();
		
		if(n==0 && m==0)  return false;
		
		taro = new int[n];
		hanako = new int[m];
		
		for(int i=0; i<n; i++){
			taro[i] = sc.nextInt();
		}
		
		for(int i=0; i<m; i++){
			hanako[i] = sc.nextInt();
		}
		
		return true;
	}
	
	public static void solve(){
		int dif = 0;
		
		for(int i=0; i<n; i++){
			dif += taro[i];
		}
		
		for(int i=0; i<m; i++){
			dif -= hanako[i];
		}

		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				 if(dif == (taro[i] - hanako[j])*2){
					 System.out.println(Integer.toString(taro[i]) + " " + Integer.toString(hanako[j]));
					 return;
				 }
			}
		}
		
		System.out.println("-1");
		
	}
}