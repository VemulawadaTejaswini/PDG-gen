import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    final int N=sc.nextInt();
    int[] n=new int[N];
    for(int i=0;i<N;i++){
      n[i]=sc.nextInt();
    }
    int answer=0;
    for(int i=0;i<N;){
      int counter=0;
      for(int j=1;j<N;j++){
        if(n[i]<n[i+j]){
          break;
        }else{
          counter=j;
        }
      }
      i+=j;
      if(answer<counter){
        answer=counter;
      }
    }
    System.out.println(answer);
  }
}