import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //すべての商品について2で割っていったときの値引き額をリストかなんかに詰め込んでいき、
    //高い順にソートしてM個目まで足していき、総額から引いたら答えになる。
    int N = sc.nextInt();
    int M = sc.nextInt();
    long A[] = new long[N];
    //各商品最大でも31枚しか使えないはず・・・
    long priceDown[] = new long[N*31]; 
    long answer =0;
    int index =0;
    long priceOff =0;
    long totalPrice=0;
    for(int i=0;i<N;i++){
      A[i] = sc.nextInt();
      totalPrice=totalPrice+A[i];
    }
    //2で割って行って値引き額を格納したら次の添字
    //値引き額が0になったら次の商品に移る
    for(int i=0;i<N;i++){
      while((A[i]-(A[i]/2))>0){
        priceDown[index]=A[i]-(A[i]/2);
        A[i]=A[i]/2;
        index++;
      }      
    }
    //値引き額をソート
    Arrays.sort(priceDown);
    int cnt=0;
    for(int i=N*31-1;i>=0;i--){
      priceOff=priceOff+priceDown[i];
      cnt++;
      if(cnt>=M){
        break;
      }
    }
   System.out.println(totalPrice-priceOff);
  
    
    
  }
  
  //最大公約数・最小公倍数（セットで使う）
static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
static int lcm (int a, int b) {return a*b/gcd(a,b);}


//素数判定
static boolean isPrime (int n) {
	if (n==2) return true;
	if (n<2 || n%2==0) return false;
	double d = Math.sqrt(n);
	for (int i=3; i<=d; i+=2) if(n%i==0){return false;}
	return true;
}


//倍数判定（10進数以外のときに有用）
static boolean isMultiple (String s, int base, int m) {
	int temp = 0;
	for (int i=0; i<s.length(); i++) {
		temp = (temp*base+Character.getNumericValue(s.charAt(i)))%m;
	}
	if (temp==0) {return true;}
	return false;
}


//階乗
static long factorial (int i) {
	if (i==1) {return 1;}
	else {return i*factorial(i-1);}
}


//進数変換
static String toNbase (String sm, int m, int n) {
	return Long.toString(Long.parseLong(sm,m),n);
}
  
}