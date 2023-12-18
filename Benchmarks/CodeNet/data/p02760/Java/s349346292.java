import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A11 = sc.nextInt();
    int A12= sc.nextInt();
    int A13 = sc.nextInt();
    int A21 = sc.nextInt();
    int A22 = sc.nextInt();
    int A23 = sc.nextInt();
    int A31 = sc.nextInt();
    int A32 = sc.nextInt();
    int A33 = sc.nextInt();
    int N = sc.nextInt();
    int[] b = new int[N];
    for (int i = 0; i < N; i++) {
      b[i] = sc.nextInt();
    }
    boolean A11t =false;
    boolean A12t =false;
    boolean A13t =false;
    boolean A21t =false;
    boolean A22t =false;
    boolean A23t =false;
    boolean A31t =false;
    boolean A32t =false;
    boolean A33t =false;

    for (int j = 0; j < N; j++) {
      if(b[j] == A11){
        A11t =true;
      }
    }
    
    for (int j = 0; j < N; j++) {
      if(b[j] == A12){
        A12t =true;
      }
    }

    
    for (int j = 0; j < N; j++) {
      if(b[j] == A13){
        A13t =true;
      }
    }
    
    for (int j = 0; j < N; j++) {
      if(b[j] == A21){
        A21t =true;
      }
    }
    for (int j = 0; j < N; j++) {
      if(b[j] == A22){
        A22t =true;
      }
    }
    for (int j = 0; j < N; j++) {
      if(b[j] == A23){
        A23t =true;
      }
    }
    for (int j = 0; j < N; j++) {
      if(b[j] == A31){
        A31t =true;
      }
    }
    for (int j = 0; j < N; j++) {
      if(b[j] == A32){
        A32t =true;
      }
    }    for (int j = 0; j < N; j++) {
      if(b[j] == A33){
        A33t =true;
      }
    }
    if(A11t == true &&A12t == true&&A13t == true){
      System.out.println("Yes"); 
      return; 
    }
    if(A21t == true &&A22t == true&&A23t == true){
      System.out.println("Yes"); 
      return; 
    }
    if(A31t == true &&A32t == true&&A33t == true){
      System.out.println("Yes"); 
      return; 
    }
    if(A11t == true &&A21t == true&&A31t == true){
      System.out.println("Yes"); 
      return; 
    }
    if(A12t == true &&A22t == true&&A32t == true){
      System.out.println("Yes"); 
      return; 
    }
    if(A13t == true &&A23t == true&&A33t == true){
      System.out.println("Yes"); 
      return; 
    }
    if(A11t == true &&A22t == true&&A33t == true){
      System.out.println("Yes"); 
      return; 
    }
    if(A31t == true &&A22t == true&&A13t == true){
      System.out.println("Yes"); 
      return; 
    }
      System.out.println("No") ;

  }
}