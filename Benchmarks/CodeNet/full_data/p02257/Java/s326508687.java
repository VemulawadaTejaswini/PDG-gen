import java.util.Scanner;

class Main{
  public static void main(String[] args){

    Scanner stdIn = new Scanner(System.in);
    /*
10^6から時間がかかりすぎる

    int[] a = new int[100000];//javaは0で初期化されてる

    a[0] = 1;
    a[1] = 1;//0と1は素数じゃないです

    //素数表
    for(int i = 2; i < a.length; i++){
      if(a[i] == 0){
        for(int j = i+1; j < a.length; j++){
          if(j % i == 0){
            a[j] = 1;
          }
        }
      }
    }
    System.out.println("素数表完成");
    int n = stdIn.nextInt();
    int cnt = 0;//素数の数
    for(int i = 0; i < n; i++){
      int x = stdIn.nextInt();
      if(a[x] == 0){
        cnt++;
      }
    }
    System.out.println(cnt);
    */

    int n = stdIn.nextInt();
    int cnt = 0;//素数の数
    for(int i = 0; i < n; i++){
      int x = stdIn.nextInt();
      boolean check = true;
      if(x == 2){
        cnt++;
      }
      else{
        for(int j = 2; j < Math.sqrt(x)+1; j++){
          if(x % j == 0){
            check = false;
            break;
          }
        }
        if(check == true){
          cnt++;
        }
      }
    }
    System.out.println(cnt);
    }
  }

