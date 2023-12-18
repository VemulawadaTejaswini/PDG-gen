import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();

    int[] ans = new int[n-1];
    int m;

    for(int i=1;i<n;i++){
      for(int j=i+1;j<n+1;j++){
        m = Math.min(j-i,Math.abs(i-x)+Math.abs(j-y)+1);
        ans[m-1]++;
        //System.out.println("i="+i+ "" + "j="+j +" " + "dis"+m);
      }
    }

    for(int a:ans)
    System.out.println(a);
  }
}