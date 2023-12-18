import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    boolean M=false;
    double width[]=new double[N];
    double max=width[0];
    double sum=0;
    for(int i=0;i<N;i++){
      width[i]=sc.nextDouble();
    }
    for(int i=1;i<N;i++){
      if(width[i]>max){
      	max=width[i];
      }
    }
    for(int j=0; j<N; j++){
    	sum+=width[j];
    }
    sum-=max;
    if(sum>max){
    System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}

