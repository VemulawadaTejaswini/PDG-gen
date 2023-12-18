import java.util.Scanner;
 
class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int L = scanner.nextInt();
    int R = scanner.nextInt();
    int min = 2018;
    
    if((R-L)<2019){
      for(int i=L; i<R; i++){
        for(int j=(i+1); j<=R; j++){
          if(min>i*j%2019){
            min = i*j%2019;
          }
        }
      }
    }else{
      min = 0;
    }
    System.out.println(min);
    
  }
}