import java.util.Scanner;

class Main{
    public static void main(String[] args){
	final Scanner sc=new Scanner(System.in);
	while(sc.hasNext()){
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int sum=a+b;
	    int count=0;
	    while(true){
		count++;
		sum/=10;
		if(sum==0) break;
	    }
	    System.out.println(count);
	}
    }
}