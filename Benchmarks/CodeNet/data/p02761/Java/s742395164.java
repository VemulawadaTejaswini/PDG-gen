import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] s = new int[M];
    int[] c = new int[M];
    for(int i=0; i<M; i++){
      s[i] = sc.nextInt();
      c[i] = sc.nextInt();
    }
    int[] num = new int[N];
    for(int i=0; i<N; i++){
    	num[i] = 10;
    }
    int ans = 0;
    int numInt = 0;
    boolean isTrue = true;
    for(int i=0; i<M; i++){
      int keta = s[i] - 1; //いじる桁 0-2 配列走査するので-1
      if(num[keta] != 10 && num[keta] != c[i]){
          isTrue = false;
          break;
      } else{
        num[keta] = c[i];
      }
    }
     if(N != 1 && num[0] == 0) isTrue = false;
     for(int i=0; i<N; i++){
        if(num[i] == 10) num[i] = 0; 
     }
     
     if(isTrue == false) {ans = -1;}
     else{
        if( N > 1 && num[0] == 0) num[0] = 1;
		if(N == 3){
          ans = num[0] * 100 + num[1] * 10 + num[2];
        } else if(N == 2){
          ans = num[0] * 10 + num[1]; 
        } else ans = num[0];
     }
 
    System.out.println(ans); 
  }
}
