import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] b = new int[N][3];
for(int i = 0; i < N ; i++){
    for(int j = 0; j < 3 ; j++){
      b[i][j] = sc.nextInt();
    }
}
int place = 0;
int chk = 0;
int abs = 0;
for(int i=0; i<N; i++){
  abs = place - b[N][1] + b[N][2];
  if(N <= abs){
    if(N % 2 == 0){
      if(N - abs % 2 != 0){
        chk = 1;
       }
    }else{
      if(N - abs % 2 == 0){
        chk = 1;
      }
    }
  }
   place = b[N][1] + b[N][2];
}
if(chk == 0) System.out.print("Yes");
else         System.out.print("No");
}//main
}//Main