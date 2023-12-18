import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    
    for(int i=0; i<n; i++){
      for(int j=0; j<n-i; j++){
        if(n == i + j){
          count++;
        }
      }
    }
    System.out.println(count/2);
  }
}
