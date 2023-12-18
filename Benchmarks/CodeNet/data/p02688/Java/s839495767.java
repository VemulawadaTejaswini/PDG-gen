import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sunu[] = new int[n];
    int k = sc.nextInt();
    for(int i = 0;i<k;i++){
      int d = sc.nextInt();
      for(int j = 0;j<d;j++){
        int a = sc.nextInt() -1;
        sunu[a]++;
      }
    }
    int count = 0;
    for(int i = 0;i<n;i++){
      if(sunu[i] == 0){
        count++;
      }
    }
    System.out.println(count);
  }
}
