import java.util.*;
 
public class  Main {
	
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    
    int [] a = new int [N];
    
    for (int i =0 ;i<N ;i++){
      	// 入室時の人数を記録したものを配列に格納
    	a[i] = sc.nextInt();	
    }
    
    int[]ans = new int [N];
    
    for (int i = 0 ; i < N ;i++){
        // 記録配列に順次アクセス→記録時人数に当たる配列番号にその時の出席番号（つまりスコープ内のi+1）を入力
    	ans [a[i-1]] = i + 1; 
    }

    for(int i:ans){
        System.out.println(i);
    }
    
    
  }  
}