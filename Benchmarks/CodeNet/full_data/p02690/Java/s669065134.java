import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextInt();

    for(int i =0;i<100;i++){
      for(int j =0;j<100;j++){
        long ii = (long)Math.pow(i,5);
        long jj = (long)Math.pow(j,5);
        if(ii-jj==N){
          System.out.println(i +" "+j); 
          return; 
        }else if(ii+jj==N){
          System.out.println(i +" -"+j);
          return;   
        }
      }
    }


    // System.out.println(-1);  
  }
}



