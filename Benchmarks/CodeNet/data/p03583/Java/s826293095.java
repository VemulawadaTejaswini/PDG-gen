import java.util.*;

public class Main{
    
    public static final int MAX = 3501;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        long n = Long.parseLong(sc.next());
        
        for(long x=1; x<MAX; x++){
            for(long y=x; y<MAX; y++){
                long u = n*x*y;
                long d = 4L*x*y-n*x-n*y;
                if(d!=0 && u%d==0 && u/d>0){
                    long z = u/d;
                    System.out.println(x+" "+y+" "+z);
                    return;
                }
            }
        }
    }
}
