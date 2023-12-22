import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
    long N = scanner.nextLong();
    int X = 0;
    
    for(int i=0; i<N; i++){
      String[i] k = scanner.next();
    }
    
    for(int j=0; j<N; j++ ){
        if(!(Arrays.asList(k).contains(k[j]))){
          X = X+1;
        }
    }
    System.out.println(X);
    
  }
}

    
    
