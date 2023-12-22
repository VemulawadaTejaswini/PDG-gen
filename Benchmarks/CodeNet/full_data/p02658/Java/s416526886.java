import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = 1;
        for (int i=0;i<n;i++){
            result = result * sc.nextLong();
            if (result > 1000000000000000000L) { 
                result = -1; 
                break;
            }
        }

        System.out.println(result);
    }
}