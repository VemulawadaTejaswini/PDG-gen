import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        int sum = 0;
        int count = 0;
        if(B != 1){
        while(sum < B){
            count++;
            sum = A*count - (count-1);
        }
    }
        System.out.println(count);
    }
}