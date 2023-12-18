import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long C = sc.nextLong();
    long D = sc.nextLong();
    long count=0;
    long Num=B-A+1;
    
     for(long i=A;i<=B;i++){
     	if(i%C==0||i%D==0){
        	count++;
        }
     }System.out.println(Num-count);
  }
}

