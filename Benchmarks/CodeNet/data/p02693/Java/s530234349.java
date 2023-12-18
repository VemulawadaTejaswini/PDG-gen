import java.util.Scanner;

public class Main {
    public static void main(String[] args){
      Scanner scan1 = new Scanner(System.in);
      int str1 = scan1.nextInt();
      
      Scanner scan2 = new Scanner(System.in);
      int str2 = scan2.nextInt();
      int str3 = scan2.nextInt();

      String result = "NG";
      for(int i=str2;i<=str3;str2++){
        if(i%7==0){
           result="OK";
          break;
        }
      }
      
      System.out.println(result);
      scan1.close();
      scan2.close();
    }
}