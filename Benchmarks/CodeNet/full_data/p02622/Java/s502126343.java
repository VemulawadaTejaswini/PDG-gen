import java.io.*;
import java.util.*;


class Main {
  private static int minOperations(String str1, String str2){
    int count = 0;
    for(int i=0;i<str1.length();i++){
      if(str1.charAt(i) != str2.charAt(i)) count++;
    }
    return count;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    
    System.out.println(minOperations(str1,str2));
  }
}
