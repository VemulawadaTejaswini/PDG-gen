
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		
		int[] num = count(s);
		
		int ans = 0;
		int pos = 0;
		while(pos < s.length()){
			pos = sarch(s, pos, num) + 1;
			ans++;
		}
		System.out.println(ans);
	}
	
	public static int sarch(String ms, int is, int[] num){
		int lastpos = is;
		int[] mnum = new int[26];
		Arrays.fill(mnum, 0);
		for(int i=is; i<ms.length(); i++){
			mnum[ms.charAt(i) - 97]++;
			if(check(mnum) <= 1){
				lastpos = i;
			}
			if(checkzero(mnum, minu(num, mnum)) >= 2){
				break;
			}
		}
		return lastpos;
	}
	
	public static int[] count(String ms){
		int[] mans = new int[26];
		Arrays.fill(mans, 0);
		for(int i=0; i<ms.length(); i++){
			mans[ms.charAt(i) - 97]++;
		}
		return mans;
	}
	
	public static int check(int[] mi){
		int mans = 0;
		for(int i=0; i<mi.length; i++){
			if(mi[i] % 2 != 0){
				mans++;
			}
		}
		return mans;
	}
	
	public static int checkzero(int[] i1, int[] i2){
		int mans = 0;
		for(int i=0; i<i1.length; i++){
			if(i1[i] % 2 != 0 && i2[i] == 0){
				mans ++;
			}
		}
		return mans;
	}
	
	public static int[] minu(int[] i1, int[] i2){
		int[] mans = new int[i1.length];
		for(int i=0; i<i1.length; i++){
			mans[i] = i1[i] - i2[i];
		}
		return mans;
	}
	
}
