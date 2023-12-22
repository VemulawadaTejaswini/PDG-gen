import java.util.*;

public class Main{

    void solve(){
	Scanner sc = new Scanner(System.in);
	
	int MAX = 1000001;
	int[] p = new int[MAX];
	for(int i=2; i<p.length; i++)p[i] = 1;
	for(int i=2; i<Math.sqrt(MAX)+1; i++){
	    for(int j=i*2; j<MAX; j+=i){
		p[j] = 0;
	    }
	}
	
	while(true){
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    if(a==0 && b==0) break;

	    int maxA = -1;
	    for(int i=a; i>=0; i--){
		if(p[i]==1 && maxA==-1) maxA = i;
		else maxA -= i;
	    }
	    int maxB = -1;
	    for(int i=b; i>=0; i--){
		if(p[i]==1 && maxB==-1) maxB = i;
		else maxB -= i;
	    }

	    System.out.println(maxA>maxB ? "a" : "b");
	}
    }

    public static void main(String[] args){
	new Main().solve();
    }
}