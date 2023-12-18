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
    // int distance = 0;
    int rightDistance = 0;
    int leftDistance = 0;
    
            right = A.get(1) - A.get(0);
            left = A.get(0) + (K - (A.get(A.size()-1)));
            if(right < left) clockwise = true;
    // if(clockwise){
        for(int i = 0;i < A.size()-1;i++){
            rightDistance += A.get(i + 1) - A.get(i);
        }
    // } else {
        for(int i = 0;i < A.size()-1;i++){
            if(i == 0){
            leftDistance += left;
            // System.out.println("i == 0" + distance);
            continue;
            }
            if(i == 1){
            leftDistance += (K - (A.get(A.size()-1)));
            // System.out.println(A.get(A.size()-1));
            // System.out.println("i == 1" + distance);
            continue;
            }
            leftDistance += A.get(A.size()-i) - (A.get(A.size()-(i+1)));
            // System.out.println(distance);
        }
    // }
    if(rightDistance < leftDistance){
        System.out.println(rightDistance);
    } else {
        System.out.println(leftDistance);
    }
    // System.out.println(distance);
  }
  
}