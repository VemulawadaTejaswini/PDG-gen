import java.util.Scanner;

public static void main(String[] args) {

  char word[];
  int k = 0;
  
  Scanner scan = new Scanner(System.in);
  String S = scan.next();
  
  int N = S.length();
  
  for(int a = 0; a < N; a++){
   
    //for文で文字数分の配列に1文字ずつ入れたかった(野望)
    word[a] = str.charAt(a);

  }
  
//文字数が偶数だったときは半分までkに+1
//同時にN-kと同じ文字か判定
  if(N % 2 == 0){
    while(k <= N / 2 ){
      if(word[k] == word[N-k]){
        k++;
      } else {
        System.out.println("No");
        continue;
      }
    }
    System.out.println("Yes");
//文字数が奇数だったときは半分までkに+1
//最大を+1にする 同時にN-kと同じ文字か判定
  } else {
    while(k <= N - 1 / 2 ){
      if(word[k] == word[N-1-k]){
        k++;
      } else {
        System.out.println("No");
      }
    }
    System.out.println("Yes");
  }
//ぴえん
  
  
  }

  
}