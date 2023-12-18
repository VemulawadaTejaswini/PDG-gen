import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int[] a = new int[6];
        int[] b = new int[3];
        for(int i = 0; i < 6; i++){
            a[i] = sc.nextInt();
        }
        String ans = "YES";
        int[] jud = new int[4];
        for(int i = 0; i < 6; i++){
            jud[a[i] - 1] ++;
        }
        for(int i = 0; i < 4; i++){
            if(jud[i] == 3){
                ans = "NO";
                
            }
        }
        System.out.println(ans);
    }
}
