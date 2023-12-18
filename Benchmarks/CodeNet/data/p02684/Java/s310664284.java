import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    long k = sc.nextLong();
    int[] a = new int[n];
    ArrayList<Integer> order = new ArrayList<>(); 
    order.add(1);
    int tmp = 0;
    boolean bool = true;
    long ans = 0;
    int j = 0;

    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
    }

    while(bool){
      if(order.contains(a[j]) == false){
       order.add(a[j]);
       j = a[j] - 1;
       } else {
        tmp = a[j];
        bool = false;
        break;
      }
    }

    int index = order.indexOf(tmp);
    int roop = order.size() - index;


    if(k <= index){
      ans = k;
    } else {
      ans = a[index + (int)((k - index) % roop)];
    }

    System.out.println(ans);

  }
}
