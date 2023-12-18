import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int N = sc.nextInt();
    // int first = sc.nextInt();
    ArrayList<Integer> A = new ArrayList<Integer>();
    while(sc.hasNext()){
        A.add(sc.nextInt());
    }
    int right = 0;
    int left = 0;
    boolean clockwise = false;
    int distance = 0;
            right = A.get(1) - A.get(0);
            left = A.get(0) + (K - (A.get(A.size()-1)));
            if(right < left) clockwise = true;
    if(clockwise){
        for(int i = 0;i < A.size()-1;i++){
            distance += A.get(i + 1) - A.get(i);
        }
    } else {
        for(int i = 0;i < A.size()-1;i++){
            if(i == 0){
            distance += left;
            // System.out.println("i == 0" + distance);
            continue;
            }
            if(i == 1){
            distance += (K - (A.get(A.size()-1)));
            // System.out.println(A.get(A.size()-1));
            // System.out.println("i == 1" + distance);
            continue;
            }
            distance += A.get(A.size()-i) - (A.get(A.size()-(i+1)));
            // System.out.println(distance);
        }
    }
    System.out.println(distance);
  }
  
}