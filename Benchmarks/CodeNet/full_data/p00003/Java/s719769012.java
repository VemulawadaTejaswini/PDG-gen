import java.util.Scanner;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a,b,c,n;
	n =sc.nextInt();
	for(int i=0;i<n;i++){
	    a=sc.nextInt();
	    b=sc.nextInt();
	    c=sc.nextInt();
	    a*=a;b*=b;c*=c;
	    if(a==b+c||b==a+c||c==a+b)System.out.println("YES");
	    else System.out.println("NO");
	}
    }
}