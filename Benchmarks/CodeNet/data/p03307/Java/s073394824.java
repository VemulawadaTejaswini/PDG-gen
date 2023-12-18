import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long max = 0;
    long min = 0;
    for(int i=0; i<N; i++){
      long x = sc.nextLong();
      if(i == 0){ max = x; min = x;}
      else{
        if(x > max) { max = x;}
        if(x < min) { min = x;}
      }
    }
    System.out.println( max - min);  
  }
}


