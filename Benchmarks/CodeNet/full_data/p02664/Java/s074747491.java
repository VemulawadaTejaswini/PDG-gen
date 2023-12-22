import java.util.Scanner;

public class Main{
  public static void main(String... args){
    Scanner scanner = new Scanner(System.in);
    StringBuilder sb = new StringBuilder('\n' + scanner.next() + '\n');

    if(sb.charAt(sb.length() - 2) == '?'){
        sb.setCharAt(sb.length() - 2, 'D');
    }
    
    boolean flag = true;
    
    while(flag){
      flag = false;
        
      for(int i = 1; i < sb.length() - 1; i++){
        if(sb.charAt(i) == '?'){
          if(sb.charAt(i - 1) == 'P'){
            sb.setCharAt(i, 'D');
          }else if(sb.charAt(i + 1) == 'D'){
            sb.setCharAt(i, 'P');
          }else if(sb.charAt(i + 1) == 'P'){
            sb.setCharAt(i, 'D');
          }else if(sb.charAt(i + 1) == '?'){
            flag = true;
            continue;
          }
        }
      }
    }
        
    System.out.println(sb.substring(1, sb.length() - 1));
  }
}