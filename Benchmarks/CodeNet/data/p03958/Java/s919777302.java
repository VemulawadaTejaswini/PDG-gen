import java.util.Scanner;

public class Main {
    public static void main(String args[] ) throws Exception {
    	new Main().exec(args);
    }

    public Main() {
    }

    public void exec(String args[]) throws Exception {
    	//初期化読み込み
    	Scanner sc = new Scanner(System.in);
    	int K = sc.nextInt();
    	int T = sc.nextInt();
    	sc.nextLine();
    	String s = sc.nextLine();
    	String[] ss = s.split(" ");
    	int[] a = new int[ss.length];
    	int max=0;
    	int total=0;
    	int total_without_max=0;
    	for (int i=0; i<a.length; i++){
    		a[i] = Integer.parseInt(ss[i]);
    		if(max<a[i]) {
    			max=a[i];
    		}
    		total += a[i];
    	}
    	total_without_max = total-max;
    	int ans = 0;
    	if(total_without_max + 1 < max) {
    		ans = max - total_without_max - 1;
    	}

    	System.out.println(ans);
	}
}