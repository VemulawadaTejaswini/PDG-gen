// あみだくじ
import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    int n = kbd.nextInt();  // 縦線の数
	    int m = kbd.nextInt();  // 横線の数
	    int a = kbd.nextInt();  // 調べたい縦線始点の番号
	    if(n!=0){
		solve(n, m, a);
	    }
	}
    }

    static void solve(int n, int m, int a){
	int[][] amida = new int[n+1][1000];
	int maxH = 0;
	// あみだくじセットここから
	while(m > 0){
	    int h = kbd.nextInt();
	    int p = kbd.nextInt();
	    int q = kbd.nextInt();
	    amida[p][h] = q;
	    amida[q][h] = p;
	    if(maxH < h) maxH = h;
	    m--;
	}
	
	// あみだくじ探索ここから
	int dep = maxH+1;
	int num = a;	
	a = amida[num][dep];
	//System.out.println(maxH);
	while(dep > 0){
	    //System.out.println(num+" "+dep);
	    if(a == 0){
		dep--;
		a = amida[num][dep];
	    }
	    else{
		num = a;
		dep--;
		a = amida[num][dep];
	    }
	}

	System.out.println(num);
    }
}