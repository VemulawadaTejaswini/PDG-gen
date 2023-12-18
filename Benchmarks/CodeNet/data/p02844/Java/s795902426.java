
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    int ans=0;
    String tmp="";
    for(int i=0;i<1000;i++){

      tmp=String.format("%03d",i);
      if(isNum(S,tmp,N)){
        ans++;
        //System.out.println(tmp);
      }
    }
    System.out.println(ans);
  }
  static boolean isNum(String S,String tmp,int N){
    //Sの中にtmpがあるかどうか確認する
    //tmpの1文字目があるかどうか
    for(int i=0;i<N;i++){
      if(tmp.substring(0,1).equals(S.substring(i,i+1))){
        //二文字目がそれ以降にあるか
        for(int j=i+1;j<N;j++){
          if(tmp.substring(1,2).equals(S.substring(j,j+1))){
            //3文字目がそれ以降にあるか
            for(int k=j+1;k<N;k++){
              if(tmp.substring(2,3).equals(S.substring(k,k+1))){
                return true;
              }
            }
            return false;
          }
        }
        return false;
      }
    }
    return false;
  }


}
 