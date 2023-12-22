import java.util.*;
class Main{
    public static void main(String[] args){
	final Scanner sc = new Scanner(System.in);
	int a =sc.nextInt();
	int max=Integer.MIN_VALUE;
	int min=Integer.MAX_VALUE;
	int sum=0;
	for(int i=0;i<a;i++){
	    int n=sc.nextInt();
	    if(n>=max) max=n;
	    if(n<=min) min=n;
	    sum+=n;
	}
	System.out.println(min+" "+max+" "+sum);
    }
}