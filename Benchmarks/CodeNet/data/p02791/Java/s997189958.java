import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =  new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int[] p = new int[n];
    int count = 0;
  for (int i = 0; i < n; i++){
    p[i] = Integer.parseInt(sc.next());
  }
  for (int i = 0; i < n; i++){
       boolean flag = true;
    	int j = 0;
    while ( (j <= i) && (flag)){
      if(p[i] > p[j]){
        flag = false;
        break;
      }
      j++;
    }
    if(flag){
    count++;
    }
  }
  System.out.println(count);
  }
}
