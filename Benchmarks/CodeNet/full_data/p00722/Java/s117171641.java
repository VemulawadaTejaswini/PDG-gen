import java.util.*;
class Main{
    boolean[] pn;
    void run(){
	Scanner sc=new Scanner(System.in);
	setPN();
	while(true){
	    int a=sc.nextInt();
	    int d=sc.nextInt();
	    int n=sc.nextInt();
	    if((a|d|n)==0)break;
	    int count=0;
	    for(int i=a;;i+=d){
		if(pn[i]){
		    count++;
		    if(count==n){
			System.out.println(i);
			break;
		    }
		}
	    }
	}
    }
    void setPN(){
	pn=new boolean[1000000];
	Arrays.fill(pn,true);
	pn[0]=false;pn[1]=false;
	for(int i=0;i*i<1000000;i++){
	    if(pn[i]){
		for(int j=i+i;j<1000000;j+=i){
		    pn[j]=false;
		}
	    }
	}
    }
    public static void main(String[] args){
	new Main().run();
    }
}