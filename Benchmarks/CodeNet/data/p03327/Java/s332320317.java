import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int N  =sc.nextInt();
        String ans;
        
        if(N<=999){
            ans = "ABC";
        }else{
            ans = "ABD";
        }
        
        System.out.println(ans);
    }
}
