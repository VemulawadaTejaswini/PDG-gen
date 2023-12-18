import java.util.*;

public class Main {
 public static void main(String... args) {
   Scanner scan = new Scanner(System.in);
   String[] line = scan.nextLine().split(" ");
   int N = Integer.parseInt(line[0]);
   int M = Integer.parseInt(line[1]);
   
   List<Integer> A = new ArrayList();
   for(int i=0; i<N; i++) {
     A.add(scan.nextInt());
   }
   
   for(int i=0; i<M; i++) {
     Collections.sort(A, Collections.reverseOrder());
     A.set(0,A.get(0)/2);
    }

   long sum=0;
   for(int elm : A) {
     sum += elm;
   }
   System.out.println(sum);
 }
}