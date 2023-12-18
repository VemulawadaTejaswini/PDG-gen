import java.io.*;
import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int W = sc.nextInt(), B = sc.nextInt(); 
    char ans[][] = new char[105][105]; 
    for(int i = 0; i<=49; i++){
      for(int j = 0; j<100; j++){
        ans[i][j] = '#';
      }
    }
    for(int i = 50; i<=99; i++){
      for(int j = 0; j<100; j++){
        ans[i][j] = '.'; 
      }
    }
    W--; 
    B--;
    for(int i = 0; i<=49; i++){
      for(int j = 0; j<100; j++){
        if(i%2 == 0 && j%2 == 0 && W > 0){
          ans[i][j] = '.'; 
          W--; 
        }
      }
    }
    for(int i = 99; i>=50; i--){ 
      for(int j = 0; j<100; j++){ 
        if(i%2 == 1 && j%2 == 0 && B > 0){
          ans[i][j] = '#';
          B--;
        }
      }
    }
    System.out.println(100 + " " + 100);
    for(int i = 0; i<100; i++){
      for(int j = 0; j<100; j++){
        System.out.print(ans[i][j]); 
      }
      System.out.println();
    }
  }
}