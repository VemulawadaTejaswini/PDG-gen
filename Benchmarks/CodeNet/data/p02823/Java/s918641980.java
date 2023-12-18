import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long A = sc.nextLong();
    long B = sc.nextLong();
long answer = 0;
    //AとBの差が偶数なら差/2でOK
    if((B-A)%2==0){
      System.out.println((B-A)/2);
      return;
    }
    //差が奇数なら壁に近い側の人間が壁で一回やり過ごして間に向かう
    if((N-B)<=(A-1)){
      //Bのほうが壁に近いか同じ
      answer=answer+(N-B);//Bが壁まで移動

      A=A+(N-B);//Aも同じだけ移動
            B=N;
      answer = answer+1;//Bが勝つ
      A=A+1;
      answer = answer + (B-A)/2;//間に向かっていく
    }else{
      //Aのほうが壁に近い
      answer = answer + (A-1);

      B=B-(A-1);//Bも同じだけ移動
            A=1;
      answer=answer+1;//Aがわざと負ける
      B=B-1;
      answer = answer +(B-A)/2;//間に向かっていく
    }
    System.out.println(answer);
    
  }
  

  
}