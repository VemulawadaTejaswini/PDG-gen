import java.util.*;
class Main{
    int p,q,a,n;
    void run(){
	Scanner sc=new Scanner(System.in);
	while(true){
	    p=sc.nextInt();
	    q=sc.nextInt();
	    a=sc.nextInt();
	    n=sc.nextInt();
	    if(q==0)break;
	    System.out.println(DFS(0,1,1,0));
	}
    }
    int DFS(int num,int den,int x,int step){
	if(p*den==num*q)return 1;
	if(p*den<num*q)return 0;
	if(step>=n)return 0;
     
	int sum=0;
	for(int i=x;i*den<=a;i++){
	    int newNum=num*i+1*den;
	    int newDen=den*i;
	   sum+=DFS(newNum,newDen,i,step+1);
	}
	return sum;
    }

    public static void main(String[] args){
	new Main().run();
    }
}