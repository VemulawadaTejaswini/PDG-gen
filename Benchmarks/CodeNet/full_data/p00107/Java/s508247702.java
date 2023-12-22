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
    Main(){
	Scanner sc =new Scanner(System.in);
	while(true){
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int c=sc.nextInt();
	    if(a==0&&b==0&&c==0)break;
	    int n=sc.nextInt();
	    int x=min(a*a+b*b,min(a*a+c*c,b*b+c*c));
	    for(int i=0;i<n;i++){
		String Ans="NA";
		int r=sc.nextInt();
		r*=2;
		if(r*r>x)Ans="OK";
		System.out.println(Ans);
	    }
	}

    }
    public static void main (String[]arg){
	new Main();
    }
}