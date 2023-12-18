import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int ans=0;
        for(int i=0;i<N;i++){
            ans=ans+i;
        }
        System.out.println(ans);
    }
}