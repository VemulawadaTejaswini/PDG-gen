import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
    	int a;
    	int n =1;
    	while(a!=0){
    		Scanner sc = new Scanner(System.in);
    		int a = sc.nextInt();
    		System.out.println("Case %d:%d",n,a);
    		n++;
    	}
}
}