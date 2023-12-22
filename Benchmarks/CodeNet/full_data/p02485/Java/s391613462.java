
import java.util.Scanner;
 
public class Main{
public static void main(String[] args){
	int sum=0,x;
	Scanner sc = new Scanner(System.in);
	while(true){
	        x=sc.nextInt();
		if(x==0){
			break;
		}
		sum+=x;
	}
	System.out.printf("%d\n",sum);
 
}
}