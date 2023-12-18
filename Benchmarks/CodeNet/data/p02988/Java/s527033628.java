import java.util.Scanner;
import java.util.Arrays; 
import java.util.*; 

public class Main{
  
  public static void main (String [] args){
    
    Scanner scanner = new Scanner(System.in);     
    //数値を入力できるように設定
    
    int num1 = scanner.nextInt();
    //数値を入力するための箱を作成
    
    int a [ ] = new int [num1];
    //入力した数値の値分の要素数を持つ配列aを準備
    
    int t = 0;
    //該当するpiの数を蓄積するための箱を用意する
    
    for(int i = 0; i < a.length; i++) {
      //配列の要素数の分だけループを繰り返す
      
      a[i]=scanner.nextInt();
      //指定した型を読み込む
      
      if (i == 0) {
        continue;
      }
      
      if (i == a.length){
        continue;
      }
      
      if((a[i-1] < a[i]) && (a[i] < a[i+1])){
        
        t++;  //該当するpiをサーチする工程
      
      } else if ((a[i-1] > a[i]) && (a[i] > a[i+1])) {
       
        t++;  //該当するpiをサーチする工程
       
      }
    }
    
    System.out.println(Arrays.toString(a));
    //XXXX
    
    System.out.println(t);
    //該当するpiの数を表示
 
    scanner.close();
    
  }
  
}