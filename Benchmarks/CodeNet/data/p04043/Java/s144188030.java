import java.util.ArrayList;
import java.util.list;
import java,.util.Scanner;

public class Main{

  Main()

 public static void mina(String args[]){
    Scanner sc = new Scanner(System.in);
    
     //コンソールから値を受け取る
     List<Integer> list = new ArrayList<>();
     for(int i=0;sc.hasNext();i++){
       list.add(sc.nextInt());
     }   
    
   int n5=0;
   int n7=0;
   
   //入力された数値のカウント
   　for(int n:list){
   　  if(n==5){
   　      n5++;
   　  }
   　  if(n==7){
   　     n7++;
   　  }
   　}
   　//入力された数値が5・7・5に並び替えられるかの凡例
   　System.out.println(n5==2&&n7==1? "YES":"NO");
   　}

}
