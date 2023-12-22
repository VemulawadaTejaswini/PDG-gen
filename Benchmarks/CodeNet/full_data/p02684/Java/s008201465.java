import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long k = sc.nextLong();
    int a[] = new int[n];
    for(int i = 0;i<n;i++){
      a[i] = sc.nextInt();
    }
    int now = 0;
    List<Integer> list = new ArrayList<Integer>();
    list.add(0);
    int count = -1;
    boolean check = true;
    int imp = -1;
    for(int i = 0;i<k;i++){
      now = a[now] -1;
      if(list.contains(now)){
        count = list.size() - list.indexOf(now);
        check = false;
        imp = now;
        break;
      }else{
        list.add(now);
      }
    }
    if(check){
      System.out.println(now + 1);
      return;
    }
    k -= imp;
    k %= count;
    for(int i = 0;i<k;i++){
      now = a[now] -1;
    }
    System.out.println(now + 1);

  }
}
