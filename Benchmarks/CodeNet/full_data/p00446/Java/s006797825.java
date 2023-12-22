import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int[] taro, hanako;
    boolean[] T, H; // そのカードが既に場に出されたか
    int t, h, n;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    if(n!=0){
		taro = new int[n];
		hanako = new int[n];
		T = new boolean[n];
		H = new boolean[n];
		Arrays.fill(T, true);
		Arrays.fill(H, true);
		
		for(int i=0; i<n; i++)
		    taro[i] = sc.nextInt();
		Arrays.sort(taro);
		int a = 0;
		int b = 0;
		for(int i=1; i<=2*n; i++)
		    if(a<n && taro[a]==i) a++;
		    else hanako[b++] = i;
		//show();
		solve();
	    }
	}
    }

    void solve(){
	int place = 0;
	int turn = 0; // even=taro

	while(count(T)>0 && count(H)>0){
	    t = 0; h = 0;
	    if(turn%2==0){
		while(t<taro.length && (taro[t]<place || !T[t])) t++;
		if(t==taro.length)
		    place = 0;
		else {
		    place = taro[t];
		    T[t] = false;
		}
	    }
	    else{
		while(h<hanako.length && (hanako[h]<place || !H[h])) h++;
		if(h==hanako.length)
		    place = 0;
		else {
		    place = hanako[h];
		    H[h] = false;
		}
	    }
	    turn++;
	}
	
	System.out.println(count(H));
	System.out.println(count(T));
    }
    
    void show(){
	System.out.print("taro :");
	for(int i=0; i<n; i++)
	    System.out.print(" "+taro[i]);
	System.out.println();
	System.out.print("hana :");
	for(int i=0; i<n; i++)
	    System.out.print(" "+hanako[i]);
	System.out.println();
    }

    int count(boolean[] a){
	int sum = 0;
	for(int i=0; i<a.length; i++)
	    if(a[i]) sum++;
	return sum;
    }
}