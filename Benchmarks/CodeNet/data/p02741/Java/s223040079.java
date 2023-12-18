import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long h = sc.nextInt();
        long w = sc.nextInt();
        long ans = 0;
        
        if(h==1 || w==1){
            ans = 1;
        }else if(h*w%2==0){
        	ans = h*w/2;
        }else{
        	ans = h*w/2+1;
        }
        
        System.out.println(ans);
    }
}
