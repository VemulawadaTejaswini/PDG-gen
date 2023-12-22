import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    long a[] =new long[n];
    long count = 1;
    
    //入力値を配列に格納
    for(int i = 0; i < n; ++i){
      a[i] = sc.nextLong();
      //0があったら0を代入
      if(0 == a[i]){
        count = 0;
      }
    }
    //0が含まれてなかった場合
    if(count != 0){
      for(int i = 0 ; i < n ; ++i){
        if(a[i]<=(long)Math.pow(10,18)/count){
          count *= a[i];
        }else{
          count = -1;
          break;
        }
        
      }
     
    }
    System.out.println(count);
  }
}