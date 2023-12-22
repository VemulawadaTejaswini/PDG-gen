import java.util.*;

class Main{

    void solve(){
	Scanner sc = new Scanner(System.in);

	while(true){
	    int n1 = sc.nextInt();
	    int n2 = sc.nextInt();
	    if(n1==0 && n2==0) break;
	    n1 = Math.max(n1, n2);
	    n2 = Math.min(n1, n2);

	    cnt = 0;
	    gcd(n2, n1);
	}
    }

    int cnt;

    void gcd(int x, int y){
	if(x==0){
	    System.out.println(y+" "+cnt);
	    return;
	}
	cnt++;
	gcd(y%x, x);
    }

    public static void main(String[] args){
	new Main().solve();
    }
}