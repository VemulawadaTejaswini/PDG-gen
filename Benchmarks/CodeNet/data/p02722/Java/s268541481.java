import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();		
        long b = 1;
        long c = 0;
        long d = 0;
        long e;
        for(long i=2;i<=Math.sqrt(a);i++){if(a%i==1){c++;}if(a%i==0){e=a;
                                                                     while(e%i==0){e/=i;}
                                                                     if(e%i==1){d++;}
                                                                    }
                                         }
        c*=2;
        c+=d;
        System.out.println(c);                                  
	}
}
