import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      String n = sc.next();
      int count =0;
      for(int i=0;i<3;i++){
        if(n.charAt(i)==n.charAt(i+1)){
          count++;
        }
      }

      if(count>=2){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }

  }
}