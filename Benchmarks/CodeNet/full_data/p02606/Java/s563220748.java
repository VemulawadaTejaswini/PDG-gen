import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        int L,R,d;
        int kosuu = 0;
        Scanner scan = new Scanner(System.in);
        L = scan.nextInt();
        R = scan.nextInt();
        d = scan.nextInt();
        if(!(L<=100) || !(R<=100 && L<=R) || !(d<=100)) System.out.print("値を範囲に抑えてね");
        for(int i = L;i<R+1;i++){
            if(i%d==0)kosuu++;
        }
        System.out.print(kosuu);
    }
}