import java.util.*;

public class Main {
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int str1 = Integer.parseInt((String)scan.nextLine());
      String tmp = scan.nextLine();
      
     String[] hani = tmp.split(" ",0);
      
      String result = "NG";
      for(int i=Integer.parseInt(hani[0]);i<=Integer.parseInt(hani[1]);i++){
        if(i%str1==0){
           result="OK";
          break;
        }
      }
      
      System.out.println(result);
      scan.close();
    }
}