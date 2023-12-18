import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    int n = s.length();
    char[] array = s.toCharArray();
    boolean flag = false;

    if(array[0]=='A'){
      int large_count = 0;
      int small_count = 0;
      for(int i =2; i<n-1;i++){
        if(array[i]=='C'){large_count += 1;}
      }
      if(large_count ==1){
        for(int j=0; j<n;j++){
          if(Character.isLowerCase(array[j])){
            small_count += 1;
          }
        }
        if(small_count == s.length()-2){
          flag = true;
        }
      }

    }

    if(flag){System.out.println("AC");}else{
      System.out.println("WA");
    }
  }
}