
import java.util.Scanner;

public class Main {
	static int intN =0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String[] a1 = sc.nextLine().split(" ");

        intN = Integer.parseInt(n);

        String result="";
        int cnt=0; // 2行目に何個1があるか
        for (int i = 0;i < intN; i++) {
        	if ("1".equals(a1[i])) {
        		cnt++;
        	}
        }
        if (cnt%2==0) {
        	System.out.println(-1);
        } else if (cnt==0) {
        	System.out.println(0);
        } else {
        	for (int i = 0;i < intN; i++) {

            }
        }

    }

    // 自分以外で割り切れたらtrue
    // 自分以外で割り切れなかったらfalse
    private static boolean warikiri(int param) {
    	for (int i = 2;i < intN;i++) {
    		if (param%i==0 && i!=param) {
    			return true;
    		}
    	}

    	return false;
    }
}