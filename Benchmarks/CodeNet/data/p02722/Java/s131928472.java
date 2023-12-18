import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong()-1;		
        long b = 1;
        long c = 0;
        long d = 0;
        for(long i=1;i<=Math.sqrt(a);i++){if(a%i==0){c++;}if(i==Math.sqrt(a)){d++;}
                                         }
        c=2*c-d+1;
        System.out.println(c);                                  
	}
}
