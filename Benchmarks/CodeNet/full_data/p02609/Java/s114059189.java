import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        String s;
        n = Integer.valueOf(in.nextLine());
        s = in.nextLine();

        int pop1, pop2;
        pop1 = popCount(s);
        pop2 = pop1-1;
        pop1++;

        long x1=0L, x2=0L, temp=0L;
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='1'){
                temp = Math.round(Math.pow(2, n-i-1));
                if(pop1>0){
                    x1 += temp % pop1;
                }
                if(pop2>0){
                    x2 += temp % pop2;
                }
            }
        }

        for(int i=0;i<n;i++){
            int count = 0;
            long xi = 0;
            int pop;
            
            if(s.charAt(i)=='1'){
                pop = pop2;
                xi = x2;
            }else{
                pop = pop1;
                xi = x1;
            }

            if(pop>0){
                if(s.charAt(i)=='1'){
                    xi -= Math.round(Math.pow(2, n-i-1)) % pop;
                }else{
                    xi += Math.round(Math.pow(2, n-i-1)) % pop;
                }
                xi = xi % pop;
                count++;
            }

            while(xi > 0){
                xi = xi % popCount(xi);
                count++;
            }
            print(count);
        }

        in.close();
    }

    private static int popCount(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            count += s.charAt(i)=='1' ? 1 : 0;
        }
        return count;
    }

    private static int popCount(long n){
        int count = 0;
        while(n>0){
            count += n%2;
            n /= 2;
        }
        return count;
    }

    private static void print(Object obj){
        System.out.println(obj);
    }
} // javac Main.java; java Main < in > out