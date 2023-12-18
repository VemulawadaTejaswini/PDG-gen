import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();    
    double ad = (double)a / d;
    double cd = (double)c / b;
    int ansa = 0;
    int ansc = 0;
    if(ad % 1 != 0){
      ad++;
      ansa = (int)ad;
    }else{
      ansa = (int)ad;
    }
    
    if(cd % 1 != 0){
      cd++;
       ansc = (int)cd;
    }else{
      ansc = (int)cd;
    }  
    if(ansa >= ansc){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}