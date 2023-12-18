import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double m = n / 1.08;
    int l = (int)m;
    
    if(l * 1.08 == (double)n){
      System.out.println((int)l);
    }else{
      System.out.println(":(");
    }
    
  }
}
