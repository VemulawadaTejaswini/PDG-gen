import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);
    
    int n;
    String[] numbers;
    int ans;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    numbers = new String[n];
	    for(int i=0; i<n; i++)
		numbers[i] = sc.next();
	    ans = 0;
	    solve(0, "");
	    System.out.println(ans/2);
	}
    }

    void solve(int level, String sum){
	if(level==n){
	    if(sum.length()>0 && !sum.substring(0, 1).equals("0")){
		//System.out.println("*"+sum);
		ans =  (ans+Integer.parseInt(sum))% 1000000007;
	    }
	    return;
	}
	solve(level+1, sum);

	solve(level+1, numbers[level]+sum);
	for(int i=1; i<sum.length(); i++){
	    String s = sum.substring(0, i)+numbers[level]+sum.substring(i);
	    solve(level+1, s);
	}
	solve(level+1, sum+numbers[level]);
    }
}