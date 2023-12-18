import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    //int N = sc.nextInt();
    int count = 0;
    
    if(str.charAt(0) == str.charAt(1)){
        count++;
    }else{
    }
    if(str.charAt(0) == str.charAt(2)){
        count++;
    }else{
    }
    if(str.charAt(1) == str.charAt(2)){
        count++;
    }else{
    }
    
    if(count == 3){
        System.out.println("No");
    }else{
        System.out.println("Yes");
    }
  }
}