import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    String s = sc.nextLine();
    
    String newS = s.replace(s[k],toLowerCase(s[k]));
    System.out.println(newS);
  }
}