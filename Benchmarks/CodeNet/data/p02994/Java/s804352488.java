import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l = sc.nextInt();
    int[] aji = new int[n];
    int abs = 2000;
    int total = 0;
    int p = -1;
    for(int i = 0;i<n;i++){
      aji[i] = l + i;
      total += aji[i];
      if(abs>Math.abs(aji[i])){
        p = i;
        abs = Math.abs(aji[i]);
      }
    }
    System.out.println(total-aji[p]);
  }
}
