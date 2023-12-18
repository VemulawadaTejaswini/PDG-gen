import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        long ans = 0;
        for(int i = 0; i < h; i++){
            if(i % 2 == 1){
                ans += w/2;
            }else{
                ans += (w-1)/2 + 1;
            }
        }
        System.out.println(ans);
    }
}
