import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[] a, b;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	static boolean read(){
		if(!sc.hasNext())return false;
		a = new int[4];
		b = new int[4];
		for(int i = 0; i < a.length; i++)a[i] = sc.nextInt();
		for(int j = 0; j < b.length; j++)b[j] = sc.nextInt();
		return true;
	}
	static void solve(){
		int hit = 0, blow = 0, check = 0;
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < b.length; j++){
				if(a[i] == b[i]){
					hit++;
					check = i;
					break;
				}
				if(a[i] == b[j])blow++;
			}
		}
		System.out.println(hit + " " +blow);
	}
}