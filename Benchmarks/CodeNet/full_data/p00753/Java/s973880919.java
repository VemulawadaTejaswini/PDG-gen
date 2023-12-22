/*
  素数判定問題。
  とりあえずエラトステネスのふるいを利用。
  n が100,000 を超えるようならエラトステネス推奨。
*/

import java.util.*;
public class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
	boolean[] primeN = new boolean[1000000];
	setP(primeN);
	while(sc.hasNext()){
	    int n = sc.nextInt();
	    if(n!=0)  solve(primeN, n);
	}
    }

    static void solve(boolean[] primeN, int n){
	int i, count=0;
	for(i=n+1; i<=n*2; i++)
	    if(primeN[i]) count++;
	System.out.println(count);
    }

    static void setP(boolean[] primeN){
	Arrays.fill(primeN, true);
	primeN[0] = false;
	primeN[1] = false;
	for(int i=2; i<primeN.length; i++){
	    for(int j=i+i; j<primeN.length; j+=i){
		primeN[j] = false;
	    }
	}
    }
}

/* 
  データを全て読み込んでから答えを返却するタイプ。
  素数判定は√n 以下でごり押し。
  割と時間がかかるので、TimeLimitが少ない場合には要注意。
  この問題は時間に余裕があるため、ごり押し型でも通る。
 */
/*
  import java.util.Scanner;
  public class Main1172 {
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int i = 0;
     int[] read = new int[123456];  // データ読み込み用配列
     // データ読み込みここから
     while(sc.hasNext()) {
        read[i] = sc.nextInt();
        i++;
     }
     // 解答ここから、read[i]=今解答中の n
     i = 0;
     while(read[i] != 0) {
        System.out.println(Pcount(read[i]));
        i++;
     }
  }


  //与えられた整数に対して、n < x <= 2*n の素数を探し個数を数え返却する
  static int Pcount(int a) {
     int count = 0;
     for(int i = (a+1); i <= 2*a; i++) {
        if(isPrime(i)) count++;          //素数ならばカウントが増える
     }
     return count;	
  }

  //ある数が素数かどうか判定する
  // 
  static boolean isPrime(int n) {
     int f = (int)Math.sqrt(n);
     while((n % f)  > 0) f--;  // f = √n から, nを割り切れるfを探す
     return f == 1;            // n==1ならば、素数なのでtrueを返す
  }
 }
*/