import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String ans = "YES";
        long a[] = new long[num];
        for(int i = 0; i < num; i++){
            a[i] = sc.nextLong();
        }
        loop: for(int i = 0; i < num; i++){
            for(int j = i+1; j < num; j++){
                //System.out.println(a[i] + "=" + a[j]);
                if(a[i] == a[j]){
                    ans = "NO";
                    break loop;
                }
            }
        }
        
        System.out.println(ans);
    }
}