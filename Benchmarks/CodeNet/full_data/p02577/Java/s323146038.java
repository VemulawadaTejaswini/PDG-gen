import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String n = scan.nextLine();
    int len = n.length();
    int sum=0;
    char[] arr = new char[len];
    
    for(int i=0;i<len;i++){
      arr[i] = (n.charAt(i));
    }
    for(int i=0;i<len;i++){
      sum = sum + Character.getNumericValue(arr[i]);
    }
    if(sum%9 == 0 || n.equals("0")){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
  
}