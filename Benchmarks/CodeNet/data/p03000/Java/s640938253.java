import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] L = new int[N];
        int D = 0;
        int count=0;
        for(int i=0; i<N;i++){
            L[i]=sc.nextInt();
        }
        while(D < X){
            D += L[count];
            count++;
        }
        System.out.println(count);
    }
}