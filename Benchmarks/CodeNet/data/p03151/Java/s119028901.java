import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long[] A = new long[N];
    long[] B = new long[N];
    long[] C = new long[N];
    long sum = 0;
    long minus = 0;
    int C_minus = 0;

    for(int i=0;i<N;i++){
      long Ai = sc.nextLong();
      A[i] =Ai;
      C[i]=Ai;
    }
    for(int i=0;i<N;i++){
      long Bi = sc.nextLong();
      B[i] =Bi;
      C[i] = C[i]-Bi;
      sum += C[i];
      if(C[i]<0){
         C_minus++;
         minus += C[i];
      }
    }
    if(C_minus=0){
      System.out.println(0);
    }else if(sum<0){
      System.out.println(-1);

    }else{

    //  System.out.println(C_minus);
    //  System.out.println(C[0]);
    //  System.out.println(C[1]);
    //  System.out.println(C[2]);
      int answer = 0;
      Arrays.sort(C);
      for(int i=C.length-1;i>=0;i--){
        minus += C[i];
    //    System.out.println(minus);
        if(minus>0){
          answer =C.length-1-i+1;
          break;
        }
      }
      answer += C_minus;
      System.out.println(answer);
    }
  }
}
