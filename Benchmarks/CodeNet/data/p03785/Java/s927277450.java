import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int c = sc.nextInt();
    int k = sc.nextInt();
    int[] t = new int[n];
    for (int i = 0;i<n;i++) {
      t[i] = sc.nextInt();
    }
    Arrays.sort(t);
    int count = 0;
    int base = 0;
    int bus = 0;
    for(int i = 0;i<n;i++){
      if(count == 0){
        bus++;
        base = t[i];
      }else if(t[i]>base+k){
        bus++;
        base = t[i];
      }
      count++;
      if(count==c)count=0;
    }
    System.out.println(bus);
  }
}
