import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		sc.close();
		//keyence
		boolean[] kf = new boolean["keyence".length()];
		char[] ks = "keyence".toCharArray();
		int idx = 0; 
		for(int i=0;i<s.length;i++){
			if(s[i]==ks[idx]){
				kf[idx] = true;
				idx++;
			}
		}
		boolean r = false;
		for(int i=0;i<kf.length;i++){
			if(!kf[i]){
				r = true;
				break;
			}
		}
		System.out.println(r?"NO":"YES");
	}
}