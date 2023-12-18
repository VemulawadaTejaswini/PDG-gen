import java.util.Scanner;

class Main{
  public static void Main(String[] args){
    Scanner sc=new Scanner(System.in);
       String C=sc.nextLine();
       String alp="abcdefghijklmnopqrstuvwxyz";
       int X=alp.indexOf(C);
      
      System.out.println(alp.charAt(X+1));
            
    }
  }