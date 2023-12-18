import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int num2=0;
        int num4=0;
        for(int i=0;i<n;i++){
            int a = Integer.parseInt(sc.next());
            if(a%4==0) num4++;
            else if(a%2==0) num2++;
        }
        int rem = n-num4;
        if(num2 > 1) rem -= num2;
        if(num4>rem-1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
