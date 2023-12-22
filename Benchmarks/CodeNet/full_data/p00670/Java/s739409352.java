import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n, S, ans;
    int[] magic;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    S = sc.nextInt();
	    if(n==0 && S==0) break;
	    magic = new int[n];
	    for(int i=0; i<n; i++)
		magic[i] = sc.nextInt();
	    ans = 0;
	    solve();
	    System.out.println(ans);
	}
    }

    void solve(){
	Arrays.sort(magic);
	for(int i=n-1; i>=0; i--){
	    if(magic[i]>=S) ans += i;
	    else if(i>0 && magic[i]+magic[i-1]<S) break;
	    else if(i>0){
		ans += search(0, i-1, i);
	    }
	}
    }
    
    int search(int left, int right, int x){
	//System.out.println(left+" "+right+" "+x);
	int mid = (left+right)/2;
	while(left!=right){
	    if(magic[mid]+magic[x] > S) right = mid;
	    else left = mid;
	    mid = (left+right)/2;
	}
	System.out.println(right);
	return x-right;
    }
}