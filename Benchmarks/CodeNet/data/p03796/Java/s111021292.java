import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    long a =1;
    for(int i=1; i<=n; i++) {  
    	a = a * i % (1000000000+7);
    }   	
    	System.out.println(a);
    }
}