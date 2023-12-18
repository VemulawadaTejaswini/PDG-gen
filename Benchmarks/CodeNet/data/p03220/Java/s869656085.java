import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int T=sc.nextInt();
    int A=sc.nextInt();
    int[] num=new int[N];
    for(int i=0;i<N;i++){
      num[i]=sc.nextInt();
    }
    int[] tem=new int[N];
    for(int i=0;i<N;i++){
      double a=num[i]*0.006;
      tem[i]=T-(int)a;
    }
    int[]  answer=new int[2];
    answer[0]=tem[0];
    for(int i=1;i<N;i++){
      int sa=A-tem[i];
      if(sa<0&&A<0) sa=sa*(-1);
      if(A-answer[0]>sa){
        answer[0]=tem[i];
        answer[1]=i;
       }
    }
    System.out.print(answer[1]+1);
  }
}