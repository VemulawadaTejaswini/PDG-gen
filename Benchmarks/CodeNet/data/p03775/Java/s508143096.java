import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        long output=Long.MAX_VALUE;
        for(int i=1;i<Math.sqrt(n)+1;i++){
            if(n%i==0){
                output=Math.min(output,Math.max((long)Math.log10(i),(long)Math.log10(n/i))+1);
            }
        }
        System.out.println(output);
    }
}