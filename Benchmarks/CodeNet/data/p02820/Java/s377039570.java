import java.util.*;
import static java.lang.System.*;

public class Main{
	static int R, S, P;
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  
	  int N = sc.nextInt();
	  int K = sc.nextInt();
	  //「自分が」それぞれの手を出して勝った時の得点
	  R = sc.nextInt(); 
	  S = sc.nextInt();
	  P = sc.nextInt();
	  String s = sc.next();
	  char[] T = s.toCharArray();
	  //出した手を記録 '?' は2通りの手を選べることを示す
	  char[] hands = new char[N+10]; 
	  long score = 0;
	  char myHand, forbiddenHand;
	  
	  //過去に出した手を考慮しなくていいパターン
	  for(int i=0; i<K; i++) {
		  myHand = victryHand(T[i]);
		  hands[i] = myHand;
		  score += (long)returnScore(myHand);
	  }
	  //過去に出した手を考慮するパターン
	  for(int i=K; i<N; i++) {
		  forbiddenHand = hands[i - K];
		  char hand = victryHand(T[i]);
		  //勝てる手と禁止されている手が同じ
		  if( forbiddenHand == hand) {
			  hands[i] = '?';
		  //違う
		  } else {
			  hands[i] = hand;
			  score += (long)returnScore(hand);
		  }
		  
	  }
	  
	  out.println(score);	  
	}
    //相手の出した手に勝てる手を返す
  	public static char victryHand(char enemyHand) {
  		if (enemyHand == 'r')
  			return 'p';
  		else if (enemyHand == 's')
  		  return 'r';
  		  else if(enemyHand == 'p')
  		return 's';
  		else 
  		   return ' ';
  	}
  	//自分の出した手に応じた得点を返す
  	public static int returnScore(char myHand) {
  		if(myHand == 'r')
  			return R;
  		else if(myHand =='s')
  			return S;
  		else if(myHand =='p')
  			return P;
  		else
  			return 0;
  	}
  }	  