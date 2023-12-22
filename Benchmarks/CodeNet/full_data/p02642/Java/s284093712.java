import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int[] p = new int[n];
      	boolean flag = false;
     	long ans = 0;
		for(int i=0;i<n;i++){
          p[i] = sc.nextInt();
        }
      	for(int i=1;i<=n;i++){
          flag = true;
          for(int j=1;j<=n;j++){
            if( i == j ){
              continue;
            }
            if( p[i-1] % p[j-1] == 0 ){
              flag = false;
              break;
            }else{
            }
          }
          if( flag ){
            ans++;
          }
        }	
      System.out.println(ans);
	}
}