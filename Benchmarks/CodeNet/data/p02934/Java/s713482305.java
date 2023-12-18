import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    double S = 0 ;
    double[] A = new double[N];
    for(int i = 0;i<N;i++){
      A[i] = scan.nextDouble();
      A[i] =1/A[i];
      S+=A[i];
    }
    System.out.println(1/S);
  }
}