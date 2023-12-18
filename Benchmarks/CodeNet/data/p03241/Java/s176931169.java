import java.util.*;
import java.util.stream.*;

class Main {
    static Scanner s=new Scanner(System.in);
    public static void main(String[]$){
        int n=s.nextInt(),t=s.nextInt();
      	int r=1;
        for(int i=2;i<=t;++i) {
            while(t%i==0&&t/i>=n){
            	t/=i;
              	r*=i;
            }
        }
      	System.out.println(r);
    }
}
