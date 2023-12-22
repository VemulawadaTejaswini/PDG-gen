import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	if(a<3 || a>10000) {
    		System.exit(0);
    	}
    	for(int i=1;i<=a;i++) {
    		if(i%3==0 || i%10==3 || i%100==3 || (i % 100)/10==3||(i % 1000)/100==3||(i /1000)==3) {
    			System.out.print(" "+i);
    		}
    	}
    	System.out.println();
    	sc.close();
     	}
    }
