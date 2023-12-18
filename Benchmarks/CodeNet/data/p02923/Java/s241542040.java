import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n,cnt,max;
    int[] h,count,work;

    n = sc.nextInt();
    h = new int[n];
    count = new int[n];
    for(int i = 0; i < h.length; i++){
      h[i] = sc.nextInt();
    }

    for(int i = 0; i < h.length - 1; i++){
      cnt = 0;
      for(int j = i + 1; j < h.length; j++){
        if(h[j-1] >= h[j]){
          cnt++;
        }else{
          break;
        }
      }
      count[i] = cnt;
    }

    max = 0;
    for(int i = 0; i < h.length - 1; i++){
      if(max <= count[i]){
        max = count[i];
      }
    }

    System.out.println(max);

  }
}