import java.util.Scanner;
 
class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int L = Integer.parseInt(scanner.next());
    int R = Integer.parseInt(scanner.next());
    
    double L_d = (double)L / 2019 - (int)((double)L/2019);
    double R_d = (double)R / 2019 - (int)((double)R/2019);
    
    if(L_d>=R_d){
      System.out.println("0");
    }else{
      String result = String.valueOf(L*(L+1)%2019);
      System.out.println(result);
    }
  }
}