import java.util.Scanner;


class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int i = 1;
     
    while(scan.hasNext()){
      int n = scan.nextInt();
      System.out.println("Case "+ i + ": "+n);
    }


    
  }
}