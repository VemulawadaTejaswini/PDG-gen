import java.util.Scanner;

class Main{
    static int area(int a,int b){
	return a*b;
    }

    static int prmt(int a,int b){
	return 2*(a+b);
    }

    public static void main(String args[]){
	Scanner scan=new Scanner(System.in);

	int a=scan.nextInt();
	int b=scan.nextInt();

	int ans1=area(a,b);
	int ans2=prmt(a,b);

	System.out.println(ans1+" "+ans2);
    }
}