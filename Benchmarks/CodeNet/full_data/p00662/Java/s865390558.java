import java.util.*;

public class Main{

    void solve(){
	Scanner sc = new Scanner(System.in);

	while(true){

	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();

	    a += sc.nextInt();
	    b += sc.nextInt();
	    c += sc.nextInt();

	    if(a==0 && b==0 && c==0) break;

	    int sum = 0;
	    sum += (a/3 + b/3 + c/3);
	    sum += Math.min(a%3,Math.min(b%3,c%3));

	    int cnt2 = 0;
	    int cnt0 = 0;
	    if(a%3==2) cnt2++;
	    if(a%3==0) cnt0++;
	    if(b%3==2) cnt2++;
	    if(b%3==0) cnt0++;
	    if(c%3==2) cnt2++;
	    if(c%3==0) cnt0++;
	    if(cnt2==2 && cnt0==1) sum++;
	    System.out.println(sum);
	}
    }

    public static void main(String[] args){
	new Main().solve();
    }
}