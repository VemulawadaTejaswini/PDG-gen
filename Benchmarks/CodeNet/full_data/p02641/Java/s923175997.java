import java.util.*;
import java.util.ArrayList;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
      	int N = sc.nextInt();
      
      List <Integer> a = new ArrayList <Integer>();//リストでaを格納する
      
      for(int i=0; i<N; i++){
          a.add(sc.nextInt());//リストにaを入力していく,aはXに含まれない整数
      }
      
      for(int i=0; i<100; i++){//N(0~100)をまわす
      if(!a.contains(X-i)){//aに含まれないX-iの整数
         System.out.println(X-i);//Xに近い前の整数
         break;
      }
      else if(!a.contains(X+i)){
              System.out.println(X+i);//Xに近い後ろの整数
              break;
      }
      }
    }
}