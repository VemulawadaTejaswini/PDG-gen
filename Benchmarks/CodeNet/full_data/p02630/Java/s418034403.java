import java.util.Arrays;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        int S=s.nextInt();
        
        int sum=0;
        for(int i = 0;i < S;i++) {
        	int x=s.nextInt();
        	sum=sum+x;
        }
        int n=s.nextInt();
        for(int i=0;i<n;i++) {
        	int x1=s.nextInt();
        	int x2=s.nextInt();
        	
        	sum=sum-(x1)+(x2);
        	
        	System.out.println(sum);
        }
    }
}