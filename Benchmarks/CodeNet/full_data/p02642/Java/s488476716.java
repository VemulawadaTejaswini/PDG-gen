import java.util.*;
 
public class Main {
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int N = sc.nextInt();
    int[] a = new int[N];
    for(int i=0;i<N;i++){
      a[i] = sc.nextInt();
    }
    int[] x = new int[1000001];
    for(int i=0;i<N;i++){
    	for(int j = 1; a[i] * j <= 1000000;j++){
      		x[a[i] * j]++;  //1つ存在すれば1 2つ以上存在すれば2以上なので解に含めない　
    	}
    }
    int count = 0;
    for(int i=0;i<N;i++){
      if(x[a[i]] == 1){
        count++;
      }
    }
    System.out.println(count);
  }
}