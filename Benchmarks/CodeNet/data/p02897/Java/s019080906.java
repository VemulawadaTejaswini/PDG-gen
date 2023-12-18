import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    final int N=sc.nextInt();
    int[] array=new int[N];
    int counter=0;
    for(int i=0;i<N;i++){
      array[i]=i;
    }
    for(int i:array){
      if(i%2!=0){
        counter++;
      }
    }
    double answer=counter/N;
    System.out.println(answer);
  }
}