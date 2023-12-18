import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
       
    int[][] val = new int[N][3];
    for(int i = 0; i < N; i++){
      String[] S = sc.nextLine().split(" ");
      val[i][0] = Integer.parseInt(S[0]);
      val[i][1] = Integer.parseInt(S[1]);
      val[i][2] = Integer.parseInt(S[2]);
    }
    
    int ax = 0;
    int ay = 0;
    int ah = 0;
    for(int i = 0; i < N; i++){
      ax = val[i][0];
      ay = val[i][1];
      ah = val[i][2];
      if(ah > 0){
        break;
      }
    }
    for(int i = 0; i <= 100; i++){
      con : for(int j = 0; j <= 100; j++){
        int H = Math.abs(i-ax) + Math.abs(j-ay) + ah;
        for(int k = 0; k < N; k++){
	      int x = val[k][0];
    	  int y = val[k][1];
       	  int h = val[k][2];
          if(h == 0){
            continue;
          }
          if(Math.abs(i-x) + Math.abs(j-y) + h != H){
            continue con;
          }
        }
        System.out.println(i+" "+j+" "+H);
        return;
      }
    }
  }
}