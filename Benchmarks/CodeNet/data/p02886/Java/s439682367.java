import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    final int N=sc.nextInt();
    int[] d=new int[N];
    for(int i=0;i<N;i++){
      d[i]=sc.nextInt();
    }
    int counter=0;
    int answer=0;
    while(counter<N-1){
      for(int i=counter;i<N-1;i++){
        answer=answer+(d[counter]*d[counter+i]);
      }
      counter++;
    }
    System.out.println(answer);
  }
}
