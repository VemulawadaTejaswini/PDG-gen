import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    int l, r;
    Scanner scanner = new Scanner(System.in);
    l = scanner.nextInt();
    r = scanner.nextInt();
    
    if(r - l > 2019){
      System.out.println(0);
    }else{
      int min = 2019*2019;
      for(int i = l; i <= r - 1; i++){
        for(int j = i + 1; j <= r; j++){
          int ij = (i * j) % 2019;
          if(ij < min){
            min = ij;
          }
        }
      }
      System.out.println(min);
    }
  }
}