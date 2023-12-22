import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	while(true){
	   
	    int i;
	    int sum=0;
	    int x =sc.nextInt();
	    if(x==0)break;
	    while(true){
		i=x%10;
		sum+=i;
	       
                x/=10;
		if(x==0)break;
	    }
	    System.out.println(sum);
	}
    }
}