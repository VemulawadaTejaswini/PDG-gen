import java.math.BigDecimal;
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        long n = 1;
        for(int i = 0; i < 18; i++){
            n = n*10;
        }
        BigDecimal nn = BigDecimal.valueOf(n);
        long sum = 1;
        for(int i = 0; i < a; i++){
            long b = scan.nextLong();
            sum = sum * b; 
        }
        BigDecimal ss = BigDecimal.valueOf(sum);
        if(ss.compareTo(nn)>0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
        }
    
    }
}