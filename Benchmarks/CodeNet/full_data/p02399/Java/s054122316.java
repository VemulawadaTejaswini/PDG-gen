import java.util.Scanner;
class Main{
    public static void main(String[] av){
	Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
	int b=sc.nextInt();
	int d=a/b;
	int r=a%b;
	double f=(double)a/b;
	System.out.print(d+" "+r+" ");
	System.out.printf("%.8f\n",f);

    
    
    }
}

