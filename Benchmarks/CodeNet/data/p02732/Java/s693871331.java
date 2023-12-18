import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer> li = new ArrayList<Integer>();
    for(int i = 0;i<n;i++){
      li.add(sc.nextInt());
    }
    Set<Integer> hs = new HashSet<Integer>(li);
    int kazu[] = new int[n];
    for(int i = 0;i<n;i++){
      kazu[i] = Collections.frequency(li,li.get(i));
    }
    int count = 0;
    for(int i: hs){
      int a = Collections.frequency(li,i);
      if(a >= 2){
        count += a * (a-1) / 2;
      }
    }
    for(int i = 0;i<n;i++){
      int a = kazu[i];
      if(a == 1){
        System.out.println(count);
      }else if(a == 2){
        System.out.println(count - 1);
      }else if(a > 2){
        int b = a * (a-1) /2;
        int c = (a-1) * (a-2) /2;
        System.out.println(count - b + c);
      }
    }
  }
}
