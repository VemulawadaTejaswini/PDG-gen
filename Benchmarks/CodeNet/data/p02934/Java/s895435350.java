import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int N = s.nextInt();
    Double Sum = 0.0;
    for (int i=0;i<N;i++){
      Sum += (1/s.nextDouble());
    }
    System.out.println(1/Sum);
    
    
  }
}