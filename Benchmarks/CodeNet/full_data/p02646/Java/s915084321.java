import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	int V = sc.nextInt();
	int B = sc.nextInt();
	int W = sc.nextInt();
	int T = sc.nextInt();
	boolean cat = false;
	int kyo = Math.abs(A-B);
	for (int t=0;t<T;t++) {
	    kyo -= V - W;
	    if(kyo <= 0) cat = true;
	}
	if (cat == true) {
	    System.out.print("YES");
	} else {
	    System.out.print("NO");
	}
    }
}

