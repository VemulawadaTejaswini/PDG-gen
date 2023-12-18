import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    boolean bl = true;
    for(int i = 0; i<3 ; i++){
      bl += (str.charAt(i) == str.charAt(i+1);
    }
    if(bl){
      System.out.println("Good");
    }else{
      System.out.println("Bad");
    }
  }
}