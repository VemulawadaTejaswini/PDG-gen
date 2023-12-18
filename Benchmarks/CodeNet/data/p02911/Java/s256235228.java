import java.util.*;

public class Main {
 public static void main(String... args) {
   Scanner scan = new Scanner(System.in);
   String[] line = scan.nextLine().split(" ");
   int N = Integer.parseInt(line[0]);
   int K = Integer.parseInt(line[1]);
   int Q = Integer.parseInt(line[2]);
   
   int[] score = new int[N];
   int A = 0;
   for(int i=0; i<Q; i++) {
     score[scan.nextInt()-1]++;
   }
   
   for(int i=0; i<N; i++) {
     System.out.println(K-Q+score[i]>0 ? "Yes" : "No");
   }
 }
}