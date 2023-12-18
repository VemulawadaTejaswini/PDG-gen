import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int d = 1;
        for(int i = 0; i < n; i++){
            if(d < k){
                d = d*2;
            } else {
                d = d + k;
            }
        }
        System.out.print(d);
    }
}