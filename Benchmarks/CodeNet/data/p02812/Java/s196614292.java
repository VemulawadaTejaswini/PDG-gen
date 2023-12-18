import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int prev = S.length();
    S = S.replace("ABC", "");
    int sum = (prev - S.length())/3;
    System.out.println(sum);
  }
}

    

      
    
