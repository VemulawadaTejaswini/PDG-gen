import java.util.*;
public class Main {
    public static void main(String[] args){
        int N, M;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        int t=1;
        for(int i=1;i<=M;i++){
            t = t * 2;
        }
        int sum = M*1900 + (N-M)*100;
        System.out.println(sum*t);

    }

}