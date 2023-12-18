import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] a;
    a = new int[num];
    for(int i = 0;i < num;i ++){
      a[i] = sc.nextInt;
    }
    int[] soat;
    soat = new int[num];
    for(int j = 0;j < num;j ++){
      for(int k = 0;k < num;k ++){
        if(soat[j] < a[k]){
          soat[j] = a[k];
        }
      }
    }
    int ans = 0;
    int cal = 1;
    for(int l = 0;l < num;l ++){
      ans = ans + cal * (soat[l]);
      cal = cal * (-1);
    }
    System.out.println(ans);
  }
}