import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int sum = 0;
    ArrayList<Integer> a = new ArrayList<Integer>();
    for (int i=0; i<n;i++){
      int b = scan.nextInt();
      sum += put(b,a);
    }
    System.out.println(sum);
  }

  public static int put(int a, ArrayList<Integer> b){
    if (b.size() == 0){
      b.add(a);
      return 1;
    }

    int t = b.get(0);
    if (a <= t){
      b.add(0,a);
      return 1;
    }
    b.add(a);
    return 0;
  }
}
