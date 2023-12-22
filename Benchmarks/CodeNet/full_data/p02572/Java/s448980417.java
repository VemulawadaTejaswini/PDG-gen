import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力(スペース改行関係なし)
        int MOD = 1000000007;
		// 整数の入力(スペース改行関係なし)
		int n = sc.nextInt();
      long kaitou = 0;
      long suebte[] = new long[n];
      
      for(int i = 0 ; i < n ; i++){
      	suebte[i] = sc.nextLong();
	  }
      
      for(int j = 0 ; j < n ; j++){
      	for(int k = j+1 ; k < n ; k++){
          kaitou = kaitou + ((suebte[j] * suebte[k]) % MOD);
        }
	  }
      
		System.out.println(kaitou);
	}
}