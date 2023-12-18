import java.util.*;
import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        long n, a, b;
        int result = 0;
        int flag1 = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextLong();
        a = scanner.nextLong();
        b = scanner.nextLong();
        for(long i =0; i < n; i++){
            if(flag1 == 0){
                result += a;
                flag1++;
            }else{
                flag1 = 0;
                i += b;
            }
        }
        System.out.println(result);
    }
}