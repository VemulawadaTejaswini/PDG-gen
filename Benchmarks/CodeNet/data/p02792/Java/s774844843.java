import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int b = sc.nextInt();
      int count=0;
      for(int i=0;i<b;i++){
        for(int k=0;k<b;k++){
        if(saijyoui(i)==saikai(k)&&saijyoui(k)==saikai(i)){
          count++;
        }
      }
      }
      System.out.println(count-1);
	}
  static int syou(int l,int n){
    int amari=l%n;
    return (l-amari)/n;
  }
  static int saijyoui(int n){
    int nyu=n;
    while(nyu>=10){
      nyu=syou(nyu,10);
    }
    return nyu;
  }
  static int saikai(int n){
    return n%10;
  }
}