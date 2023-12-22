import java.util.*;
class Main{

    int min(int a,int b){
	if(a<b)return a;
	else return b;
    }

    int max(int a,int b){
	if(a>b)return a;
	else return b;
    }

    int calc(int b,int c,int d,int e){
	int res=b*d+c*e;
	if(d>=5&&e>=2)res=res*8/10;
	return res;
    }

    Main(){
	Scanner sc =new Scanner(System.in);
	while(true){
	    int a=sc.nextInt();
	    int b;
	    int c=0;
	    int d=0;
	    int m=100000;
	    boolean x=false;
	    if(a==0)break;
	    for(int i=0;i<a;i++){
		b=sc.nextInt();
		if(b>=2){
		    x=true;
		    c++;
		}
		d+=b;
		if(b<m&&b>=2)m=b;
	    }
	    d-=m;    
	    if(!x){
		System.out.println("NA");
	    }else if(c==1){
		System.out.println(2);
	    }else{
		System.out.println(d);
	    }
	}
    }
    public static void main (String[]arg){
	new Main();
    }
}