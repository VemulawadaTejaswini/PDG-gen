import java.util.Scanner;

class Main{
  public static void main(String[]args){
    
  Scanner sc=new Scanner(System.in);
  int X=sc.nextInt();

  for(int i=0; i<X; i++){
    int array[]=new int[X];//X個の要素を持つ配列を準備
    int ay[]=new int[X];//X個の要素を持つ入力用配列を準備
        ay[i]=sc.nextInt();
        array[i]=ay[i];
    if(array[i]%2==0){//配列の要素一つ一つを確認
          if(array[i]%3==0){//3で割り切れる場合
            System.out.println("APPROVED");
          }else if(array[i]%5==0){//5で割り切れる場合
            System.out.println("APPROVED");
          }else{
            System.out.println("DENIED");
          }
    }else{
      System.out.println("DENIED");
    }
  }
 }
}