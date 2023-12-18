import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        long A = sc.nextLong();
        long B = sc.nextLong();
        sc.close();
      
        System.out.println( calc(A-1) ^ calc(B) );
    }

    static long calc(long val){
        if( val <= 0L ){
            return 0L;
        }
        
        String str = Long.toBinaryString(val);
        boolean[] odd = new boolean[41];
        long base = 1L;
        
        for(int i = 0; i < str.length(); i++){
            
            if(i == 0){
                long x = val % 4;
                if( x == 1 || x == 2 ) odd[0] = true;
                continue;
            }
            
            base *= 2;
            if( str.charAt(str.length()-1-i) == '0' ){
                continue;
            }
            
            long cnt1 = (val % base) + 1;
            if( cnt1 % 2 == 1) odd[i] = true;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = str.length()-1; i >= 0; i--){
            if(odd[i]){
                sb.append("1");
                
            }else{
                sb.append("0");
            }
        }
        
        return Long.parseLong(sb.toString(), 2);
        
    }
}
