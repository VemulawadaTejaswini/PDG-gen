import java.util.*;

public class Main{

    void solve(){
	Scanner sc = new Scanner(System.in);

	while(true){
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    if(x==0 && y==0) break;

	    int[] appear = new int[1000001];
	    Arrays.fill(appear, -1);
	    int a = 0, b = 0;
	    for(int i=0;;i++){
		x = x%y;
		if(appear[x]!=-1){
		    a = appear[x];
		    b = i-appear[x];
		    if(x==0) b = 0;
		    break;
		}else{
		    appear[x] = i;
		}
		x *= 10;
	    }

	    System.out.println(a+" "+b);
	}
    }

    public static void main(String[] args){
	new Main().solve();
    }
}