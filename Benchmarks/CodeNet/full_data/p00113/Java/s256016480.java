import java.util.*;
class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);
    
    void run(){
	while(sc.hasNext()){
	    int p = sc.nextInt();
	    int q = sc.nextInt();
	    if(p<=0 || q<=0) continue;
	    solve(p%q, q);
	}
    }

    void solve(int p, int q){
	int[] y = new int[q];
	Arrays.fill(y, -1);
	int cnt=1;
	y[p%q]=0;
	p = p*10;
	while(true){
	    if(y[p%q]>=0){
		System.out.println(p/q);
		print(cnt, y[p%q]);
		break;
	    }
	    if(p%q==0){
		System.out.println(p/q);
		break;
	    }
	    System.out.print(p/q);
	    y[p%q] = cnt;
	    p = (p%q)*10;
	    cnt++;
	}
    }
    
    void print(int c, int idx){
	int i;
	for(i=0; i<idx; i++)
	    System.out.print(" ");
	for(; i<c; i++)
	    System.out.print("^");
	System.out.println();
    }
}