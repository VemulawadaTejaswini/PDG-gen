import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
      String num = sc.next();
      if(num.length() == 1 && Character.getNumericValue(num.charAt(0)) == 0){
        break;
      }
      else{
        int sum = 0;
        for(int i = 0; i < num.length(); i++){
          sum += Character.getNumericValue(num.charAt(i));
        }
        System.out.printf("%d\n", sum);
      }
    }
  }
}
