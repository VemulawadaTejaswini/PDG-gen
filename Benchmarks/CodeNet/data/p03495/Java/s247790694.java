import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] a = new int [n];
    for(int i = 0;i < n;i++){
      a[i] = sc.nextInt();
    }

    int kind = 0;
    int[] l = new int [n];
    Arrays.sort(a);
    for(int i = 0;i < n - 1;i++){
      l[kind]++;
      if(a[i] != a[i + 1]){
        kind++;
      }
    }
    l[kind]++;
    kind++;

    if(k < kind){
      int kindSum = 0;
      Arrays.sort(l);
      for(int i = 0;k != kind;){
        if(l[i] != 0){
          kindSum += l[i];
          kind--;
        }
        i++;
      }
      System.out.println(kindSum);
    }else{
      System.out.println(0);
    }
  }
}