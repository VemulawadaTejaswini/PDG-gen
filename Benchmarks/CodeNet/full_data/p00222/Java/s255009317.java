import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);

    static int[] quatro = new int[900];

    public static void main(String[] args){
	prepare();

	while(true){
	    int n = kbd.nextInt();
	    if(n==0) break;
	    solve(n);
	}
    }

    static void solve(int n){
	int i = 0;
	while(quatro[i]>n) i++;
	System.out.println(quatro[i]);
    }

    static void prepare(){
	int m = 10000000;
	int i = 0;
	for(; m-8>1; m--){
	    if(check(m)) {
		quatro[i] = m;
		i++;
	    }
	}
	//System.out.print(quatro[i-1]+" "+i);
    }

    static boolean check(int m){
	return prime(m)&&prime(m-2)&&prime(m-6)&&prime(m-8);
    }

    static boolean prime(int a){
	int k = (int)Math.sqrt(a);
	for(int i=2; i<=k; i++){
	    if(a%i == 0) return false;
	}
	return true;
    }
}