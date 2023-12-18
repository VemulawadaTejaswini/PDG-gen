import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

    	Scanner sc = new Scanner(System.in);
    	String[] S = sc.next().split("");
    	int ans = 753;
    	for(int i = 0; i < S.length-2; i++){
    		String str = S[i] + S[i+1] + S[i+2];
    		int num = Math.abs(753 - Integer.parseInt(str));
    		ans = Math.min(num, ans);
    	}
    	System.out.println(ans);
    }
}