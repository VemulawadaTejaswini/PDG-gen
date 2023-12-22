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
      System.out.println("先週開催されたコンテストはARCなので今週はABCが開催されます。");
   // return;
  }else if(title.equals("ABC")){
      System.out.println("先週開催されたコンテストはABCなので今週はARCが開催されます。");
   // return;
  } else{
    System.err.println("コンテスト名が正しくありません。");
   // return;
  }
}
}