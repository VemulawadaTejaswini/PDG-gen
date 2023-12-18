import java.util.*;
public class Main {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] L = new int[N * 2];

    for(int i=0;i<N*2;i++){
        L[i] = sc.nextInt();
    }
    Arrays.sort(L);

//    System.out.println("N = " + N);
//    System.out.println("L = " + Arrays.toString(L));
    
    int cnt = 0;

    for (int j=0;j<N*2-1;j+=2){
        cnt += Math.min(L[j], L[j+1]);
    }
    System.out.println("cnt = " + cnt);

}
}