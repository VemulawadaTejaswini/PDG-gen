import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
 
        checker(str);
        scan.close();
    }
  
public static void checker(String title){
  if(title.equals("ARC")){
      System.out.println("ABC");
   // return;
  }else if(title.equals("ABC")){
      System.out.println("ARC");
   // return;
  } else{
    System.err.println("コンテスト名が正しくありません。");
   // return;
  }
}
}