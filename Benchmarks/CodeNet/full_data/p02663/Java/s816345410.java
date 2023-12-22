import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int wake_h = scan.nextInt();
        int wake_m = scan.nextInt();
        int sleep_h = scan.nextInt();
        int sleep_m = scan.nextInt();
        int study = scan.nextInt();
        int total;
        
        if(sleep_m - wake_m < 0){
            total = (sleep_h - wake_h -1)*60 + (60-(sleep_m - wake_m));
        }else{
            total = (sleep_h - wake_h)*60 + (sleep_m - wake_m);
        }
        
        System.out.println(total-study);
    }
}