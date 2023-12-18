import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	// スペース区切りの整数の入力
	int n = sc.nextInt();
    String[] s = new String[n];
    
    //sにアルファベット順にソートした文字列を格納
    for(int i = 0; i < n; i++){
      char[] tmp = sc.next().toCharArray();
      Arrays.sort(tmp);
      s[i] = new String(tmp);
    }
    
    //文字列照合
    double count = 0;
    for(int i = 0; i < n; i++){
      for(int j = i; j < n; j++){
        if(s[i].equals(s[j])){
          count++;
        }
      }
      count--; //j==iの部分の差し引き
    }
    
    System.out.println(String.format("%.0f", count));
    
  }
}