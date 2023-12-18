import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int sum = 0;
    for(int i = 1; i <= N; i++){
    	for(int j = i; j <= N; j++){
    		for(int k = j; k <= N; k++){
    			int[] ary = {i,j,k};
    			Arrays.sort(ary);
    			int tmp = gcd(ary[0],ary[1]);
    			int tmp2 = gcd(tmp,ary[2]);
    			if(i == j && j == k){
    				sum += tmp2;
    			}else{
    				sum += tmp2 * 3;
    			}
    		}
    	}
    }
    System.out.print(sum);
  }
  
  public static int gcd(int i, int j){
    int ret = 0;
    if(0 > j){
    	gcd(i, i % j);
    }else{
    	ret = i;
    }
    return ret;
  }
}