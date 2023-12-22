import java.util.Scanner;
import java.util.Date;

class arre{
    private  int A[]=new int[10000];
    private int top=0;

    public void open(int a){
	if(a-1>=0&&A[a-1]!=A[a]){
	    A[a-1]=A[a];
	    open(a-1);
	}
    }
    public void input(int b){
	A[top]=b;
	if((top)%2==1){open(top);}
	top++;
    }
    public void output(int c){
		System.out.println(A[c]);
    }
    public int outInt(int d){
	return A[d];
    }
}
class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	while(true){
	    arre ar =new arre();
	    int n= sc.nextInt();
	    if(n==0){break;}
	    for(int i=0;i<n;i++){
		ar.input(sc.nextInt());
	    }
	    int x=0;
	    for(int j=0;n>j;j++){
		if(ar.outInt(j)==0)x++;
	    }
	    System.out.println(x);
	}
    }
}