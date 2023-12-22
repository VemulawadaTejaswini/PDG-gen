import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n, p;

    void run(){
	while(sc.hasNext()){
	    n = sc.nextInt();
	    if(n==0) break;

	    p = cal(n); // パターン数
	    //System.out.println("pattern:"+p);
	    p = p/10 + (p%10==0 ? 0:1); // 日数
	    //System.out.println("days:"+p);
	    p = p/365 + (p%365==0 ? 0:1); // 年変換

	    System.out.println(p);
	}
    }

    int cal(int n){
	if(n<0) return 0;
	if(n==0) return 1;

	return cal(n-1)+cal(n-2)+cal(n-3);
    }
}