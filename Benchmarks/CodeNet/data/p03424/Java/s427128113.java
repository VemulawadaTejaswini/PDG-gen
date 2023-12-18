import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;
        for(int i=0;i<N;i++){
            String cur = sc.next();
            if(cur=="Y") {
                result =1;
                break;
            }
        }
        String ans;
        if(result==0) ans = "Three";
        else ans = "Four";
        System.out.println(ans);

    }
}