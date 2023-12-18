import java.util.*;
import java.lang.*;

class Transceivers{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int abcd[] = new int [4];
    for(int i = 0;i < 4;i++){
      abcd[i] = sc.nextInt();
    }
    if(Math.abs(abcd[0] - abcd[2]) <= abcd[3] || (Math.abs(abcd[0] - abcd[1]) <= abcd[3] && Math.abs(abcd[1] - abcd[2]) <= abcd[3])){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}