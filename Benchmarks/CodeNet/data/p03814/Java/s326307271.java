import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    boolean testA = false;
    boolean testZ = false;
    int count = 0;
    
    for(int i=0; i<str.length(); i++){
        if(str.charAt(i) == 'A'){
            testA = true;
        }
        if(testA){
            count++;
                if(i == str.length()-1){
                    break;
                }else{
                        if(str.charAt(i) == 'Z' && str.charAt(i+1) != 'Z'){
                        break;
                }
            }
        }
    }
    System.out.println(count);
  }
}