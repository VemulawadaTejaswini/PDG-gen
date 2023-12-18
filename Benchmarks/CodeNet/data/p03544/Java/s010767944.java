import java.util.Scanner;
import java.Math.BigInteger;
 
public class Main {
 
	public static void main(String[] args) {
		no2();
	}
 
 	static void no2() {
		try (Scanner sc = new Scanner(System.in)) {
 	    int n = 5;
 	    
        BigInteger f0 = new BigInteger(2);
        BigInteger f1 = new Biginteger(1);
        Biginteger f2;
        
        if(n==1){
				System.out.println(f0);
				return;
        }
        if(n==2){
				System.out.println(f1);
				return;
        }
        
        for(int i = 3;i <= n; i++){
            f2 = f0.add(f1);
            f0 = f1;
            f1 = f2;
        }
        
		System.out.println(f2);
	}
}
 
}