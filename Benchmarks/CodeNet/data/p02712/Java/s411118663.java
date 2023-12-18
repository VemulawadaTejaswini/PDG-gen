import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int count = 0;
    int countA = 0;
    ArrayList<Integer> a = new ArrayList<Integer>();
    for(int i = 0;i < N;i++){
        count++;
        if(count % 3 == 0 && count % 5 == 0){
            // System.out.println("FIzzBuzz");
        } else if(count % 3 == 0){
            // System.out.println("Fizz");
        } else if(count % 5 == 0){
            // System.out.println("Buzz");
        } else {
            a.add(count);
        }
    }
        int print = 0;
        for(int i = 0;i < a.size();i++){
            print += a.get(i);
            // System.out.println(print);
        }
        System.out.println(print);
  }
}