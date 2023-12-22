import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
   public static void main(String[] args) {
     
        //sec--1
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] p = new int[N];
        for(int i=0; i<N; i++) {
          p[i] = sc.nextInt();
        }
     
        //sec--2
        Arrays.sort(p); //配列要素を昇順（値が小さい順）で並べ替え
     
        //sec--3
        int cnt = 0;
        for(int i=0; i<K; i++) {
          cnt += p[i];
        }
     
        //sec--4
        System.out.println(cnt);
   }
}
