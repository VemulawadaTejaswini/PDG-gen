import java.util.*;
class Main{
    Scanner sc=new Scanner(System.in);
    void main(){
	int a=sc.nextInt();
	int b=sc.nextInt();
	int d=a/b;
	int r=a%b;
	double f= (double)a/b;
	System.out.print(d+" "+r+" ");
	System.out.printf("%.5f", f );
	System.out.println();
    }
    public static void main(String[]ag){
	new Main().main();
    }
}