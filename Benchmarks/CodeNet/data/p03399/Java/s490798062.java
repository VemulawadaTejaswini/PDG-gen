import java.io.*;
import java.util.*;


public class Solution {

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt(), B = sc.nextInt();
    int S = 0;
    if(A <= B){
      S += A; 
    }
    else{
      S += B;
    }
    int C = sc.nextInt(), D = sc.nextInt();
    if(C <= D){
      S += C; 
    }
    else{
      S += D;
    }
    System.out.println(S);
  }
}
