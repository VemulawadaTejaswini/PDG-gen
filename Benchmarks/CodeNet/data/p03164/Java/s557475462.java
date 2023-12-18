import java.util.Scanner;

public class Main{
  static int N;
  static int W;
  static int WE[];
  static int VA[];
  static int DP[];
  static int max;
  static int ans;
  public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   N = sc.nextInt();
   W = sc.nextInt();
   WE = new int[N];
   VA = new int[N];
   for(int i=0;i<N;i++){
     WE[i]=sc.nextInt();
     VA[i]=sc.nextInt();
   }
   ans = rec(0,0);
 System.out.println(ans);
}


  static int rec(int i, int j){
    int res = 0;
    int max = 0;
    if(i==N){
      res = 0;
    }
    else if(j+WE[i]>W){
      res = rec(i+1,j);
    }
    else {
      res=Math.max(rec(i+1,j),rec(i+1,j+WE[i])+VA[i]);
    }

    return res;
  }

}