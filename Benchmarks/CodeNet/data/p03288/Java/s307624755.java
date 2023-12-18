import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String ans = "AGC";
        if(N < 1200){
            ans = "ABC";
        }else if(N < 2800){
            ans = "ARC";
        }
        System.out.println(ans);
    }
}
