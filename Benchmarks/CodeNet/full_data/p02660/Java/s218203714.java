import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int N = sn.nextInt();
        int cnt = 0;
        int z = 2;
        while(N != 1){
            if(N % z == 0){
                cnt++;
                N /= z;
            }
            z++;
        }

        System.out.println(cnt);
    }
}