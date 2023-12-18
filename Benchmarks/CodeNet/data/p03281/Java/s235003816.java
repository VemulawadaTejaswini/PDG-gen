import java.util.Scanner;

public class Main{
  public static void main(String[] args){
  Scanner scanner=new Scanner(System.in);
  int n =scanner.nextInt();
  
  if(n>=105&&n<165){
    n=1;
    }elseif(n>=165){
    n=2;
    }else{
    n=0;
    }
  System.out.println(n);
  }
}