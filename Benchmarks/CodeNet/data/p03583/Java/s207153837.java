import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();
        sc.close();

        for(long i = 1; i <= 3500; i++){
            for(long j = 1; j <= 3500; j++){
                long m = 4*i*j-N*(i+j);
                if(m <= 0)
                    continue;
                else {
                    if(N*i*j%m == 0 && N*i*j/m <= 3500 ){
                        System.out.println(i+" "+j+" "+N*i*j/m);
                        return;
                    }
                }
            }
        }
    }
}