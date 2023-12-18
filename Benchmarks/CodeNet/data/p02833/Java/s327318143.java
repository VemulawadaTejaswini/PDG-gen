import java.util.*;
import static java.lang.System.*;
 
public class Main{
  public static void main(String[] args){//方針としては、階乗求めてからその階乗分あるルートを全部求めて足して、それを階乗の数値で割る
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();//配列の数
    int NN=N-2;
    while(NN>=2){
      N*=NN;
      NN-=2;
    }
    String NNN = String.valueOf(N);
    int cntt=1;
    int cnt=0;
    while(cntt>=1){
      if(NNN.charAt(NNN.length()-cntt) != '0'){
        break;
      }else{
        cnt+=1;
        cntt+=1;
      }
    }
    out.print(cnt);




  }
}
