import java.util.*;
class Main{
    final int N=123456+10;
    boolean[] pn=new boolean[N*2];
    void run(){
	Scanner sc=new Scanner(System.in);
	Arrays.fill(pn,true);
	setPN();
	while(true){
	    int n=sc.nextInt();
	    if(n==0)break;
	    int ans=0;
	    for(int i=n+1;i<=2*n;i++){
		if(pn[i])ans++;
	    }
	    System.out.println(ans);
	}
    }
    void setPN(){
	pn[0]=false;pn[1]=false;
	for(int i=2;i*i<2*N;i++){
	    if(pn[i]){
		for(int j=i+i;j<2*N;j+=i){
		    pn[j]=false;
		}
	    }
	}
    }
    public static void main(String[] args){
	new Main().run();
    }
}