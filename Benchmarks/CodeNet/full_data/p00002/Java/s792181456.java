import java.util.Scanner;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a,b,c,d;
	while(sc.hasNextInt()){
	    a=sc.nextInt();
	    b=sc.nextInt();
	    c=a+b;
	    d=0;
	    while(c>0)
		{
		    c/=10;
		    d++;
		}
	    System.out.println(d);
	}
    }
}