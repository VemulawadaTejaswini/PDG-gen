import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int m = sc.nextInt();
      int[] data = new int[m];
      int count = 1;
      int ans = 0;

      for (int t = 0;t<m ;t++ ) {
        data[t] = sc.nextInt();
      }

      for (int i =0 ;i<m ;i++ ) {
          if(data[i]==count){
            count++;
          }else{
            ans++;
          }
        }

        if (count>1) {
          System.out.println(ans);
        }else{
            System.out.println("-1");
        }

}
}
