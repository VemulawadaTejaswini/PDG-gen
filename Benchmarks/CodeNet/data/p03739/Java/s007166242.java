import java.util.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long ans = 0l;
        long sum = 0l;
        boolean fg= false;
        for(int i=0;i<n;i++){
            long tw = Long.parseLong(sc.next());
            sum += tw;
            if(i>0){
                if(fg && sum>=0l){
                    ans += sum+1;
                    sum = -1;
                }else if(!fg && sum<0){
                    ans += Math.abs(sum)+1;
                    sum = 1;
                }
                fg = !fg;
            }else{
                fg = sum>=0l;
            }
        }
        System.out.println(ans+(sum==0?1:0));
    }
}