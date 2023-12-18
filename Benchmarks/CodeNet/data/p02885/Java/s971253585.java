import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans;
        ans = a - b*2;
        if(ans<0){
            ans = 0;
        }
        
        System.out.println(ans);
    }
}