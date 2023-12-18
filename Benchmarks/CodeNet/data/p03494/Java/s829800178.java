import java.util.*;
public class Main {
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
      //書かれている整数の個数
      int n = sc.nextInt();
      int a[] = new int[n];
      //カウンター
      int c = 0;
      for(int i = 0; i < n; i++){
        //黒板に書かれている整数
      	a[i] = sc.nextInt();
      }
      
      while(true){
        //奇数かどうかカウンターを立てる
        boolean odd = false;
        for(int i = 0; i < n; i++){
          if(a[i] % 2 != 0){
            odd = true;
          }
        }
        
        if(odd == true){
          break;
        }
        
        for(int i = 0; i < n; i++){
          a[i] = a[i] / 2;
        }
        c++;
      }
		System.out.println(c);
	}
}
