import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int k = sc.nextInt();

    int ans = 0;    
    
    int[] nList = new int [n];
    int[] mList = new int [m];
    
    for (int i = 0; i < n; i++){
      nList[i] = sc.nextInt();
    }
    
    for (int i = 0; i < m; i++){
      mList[i] = sc.nextInt();
    }
    
    int m1 = 0;
    int n1 = 0;
    boolean mFlg = true;
    boolean nFlg = true; 
    
    while (k > 0){
      if(mFlg && nFlg){
        if (mList[m1] <= nList[n1]){
          k -= mList[m1];
          m1++;
        } else if (mList[m1] > nList[n1]){
          k -= nList[n1];
          n1++;
        }
      } else if(!mFlg && nFlg){
        k -= nList[n1];
        n1++;
      } else if(mFlg && !nFlg){
        k -= mList[m1];
        m1++;
      } else {
        break;
      }
      if(k >= 0){
        ans++;
      }
      if (m1 == m){
        mFlg = false;
      }
      if (n1 == n){
        nFlg = false;
      }
    }
    
    System.out.println(ans);
  }
}