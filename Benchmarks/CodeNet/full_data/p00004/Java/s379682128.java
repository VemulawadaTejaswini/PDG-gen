import java.util.Scanner;

class Main{
    public static void main(String[] args){
	final Scanner sc=new Scanner(System.in);
	while(sc.hasNext()){
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int c=sc.nextInt();
	    int d=sc.nextInt();
	    int e=sc.nextInt();
	    int f=sc.nextInt();
	    int b2=b*d;
	    int c2=c*d;
	    int e2=a*e;
	    int f2=a*f;
	    double y = (double)(c2-f2)/(b2-e2);
	    double x = (double)((c-b*y)/a);
	    System.out.printf("%.3f %.3f\n",x,y);
	}
    }
}