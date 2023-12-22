import java.util.*;
public class Main {
	public static void main(String[] args){
    
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
      int flag =0;
		// スペース区切りの整数の入力
      long m = (long)Math.pow(10,9)+7;
      long[] a = new long[n];
      for(int i=0;i<n;i++){
		a[i] = Long.parseLong(sc.next()) % m;
        //a[i] = sc.nextLong() ;
        if(a[i] == 0){
          flag =1;
        }
      }
      
    //入力
       if(flag == 1){
        System.out.println("0");
      }else{
      long sum = 0;
      for(int k=0;k<n;k++){
 	 	for(int j = k+1;j<n;j++){
		sum += (a[k] * a[j]) %m;
	/*	System.out.println(a[k]);
          System.out.println(a[j]);
          System.out.println("");
     */
		}
      }
      System.out.println(sum%m);
       }
}
}

