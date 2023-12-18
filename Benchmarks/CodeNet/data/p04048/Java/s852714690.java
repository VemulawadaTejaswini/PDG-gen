import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
    	new B().doIt();
    }
    class B{
    	void doIt(){
    		long N = sc.nextLong();
    		long X = sc.nextLong();
    		long XX = X * 2;
    		if(N - XX < 0)X = N - X;
    		long NN = N - X;
//    		System.out.println(NN+" "+X);
    		if(X == 0){
    			X = NN;
    			NN = 0;
    		}
    		long sum = X + NN;
    		while(true){
//    			System.out.println(NN+" "+X);
    			if(NN % X == 0)break;
    			long cnt = (NN / X)*2;
    			sum = sum + cnt * X;
    			long temp = X;
    			X = NN % X;
    			NN = temp;
    		}
    		long cnt = (NN / X)*2 - 1;
    		sum = sum + cnt * X;
    		System.out.println(sum);
    	}
    }
}