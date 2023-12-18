import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n-1];
        if(n==2){
            System.out.println((sc.nextInt() * 2));
            return;
        }
        for(int i = 0;i<(n-1);i++){
            b[i] = sc.nextInt();
        }
        int result = b[0] + b[n-2];
        for(int i = 0;i<(n-2);i++){
            if(b[i]<b[i+1]){
                result += b[i];
            }else{
                result += b[i+1];
            }
        }
        System.out.println(result);
        sc.close();
    }
}