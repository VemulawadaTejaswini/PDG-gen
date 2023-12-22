import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int X = sc.nextInt();
      	int[] num = new int[X];
      	int ans = 0;
      	for(int i=0;i<X;i++){
          num[i] = sc.nextInt();
        }
      	Arrays.sort(num);
      	for(int i=1;i<X-1;i++){
          for(int j=i+1;j<X;j++){
            if( num[j] % num[i] == 0 ){
              ans ++;
            }
          }
        }
      System.out.println(ans);    	
	}
}