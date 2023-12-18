import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int a[] = new int [N-1];
        int count =0;
        
        for(int i=0;i<N-1;i++){
            a[i] = sc.nextInt();
        }
        
        
        for(int i=0;i<N-1;i++){
        
            count += Math.min(b[i],b[i+1]);
        
        }
        
        System.out.println(count);
        
        
    }
}
