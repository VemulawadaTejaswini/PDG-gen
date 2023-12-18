import java.util.*;

public class Main{
  public static double distance(int N,long[] space){
    if(N==2){
      return (space[0]%(Math.pow(10,9)+7));
    }
    else{
      long Answer=0L;
      
      for(int i=1;i<=N-1;i++){
        if(i==1){
          Answer+=(space[0]+distance(N-1,spacecut(N-1,space,0)))%(Math.pow(10,9)+7);
        }else{
          Answer+=(space[i-1]+distance(N-1,spacecut(N-1,space,i-2)))%(Math.pow(10,9)+7);
        }
      }
      return Answer%(Math.pow(10,9)+7);
    }
  }
  
  public static long[] spacecut(int L,long[] space,int M){
    long[] answer=new long[L-1];
    if(M==0){
      for(int i=0;i<=L-2;i++){
        answer[i]=space[i+1];
      }
    }else{
      for(int i=0;i<M;i++){
        answer[i]=space[i];
      }
      answer[M]=space[M]+space[M+1];
      for(int i=M+1;i<L-1;i++){
        answer[i]=space[i+1];
      }
    }
    return answer;
  }
  
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    long[] x=new long[N];
    long[] space=new long[N-1];
    
    for(int j=0;j<N;j++){
      x[j]=sc.nextLong();
    }
    for(int k=0;k<=N-2;k++){
      space[k]=x[k+1]-x[k];
    }
    
    double Answer=0.0;
    Answer=distance(N,space);
    
    System.out.println(Answer);
  }
}