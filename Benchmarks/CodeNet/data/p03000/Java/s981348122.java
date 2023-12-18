
import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);        
        int n = stdIn.nextInt();
        int x = stdIn.nextInt();
        int count;
        int sum;
        for( count = 0,sum = 0; count < n;){
             sum += stdIn.nextInt();
             count++;
             if(sum > x) break;
        }
        System.out.println(count);

    }
}