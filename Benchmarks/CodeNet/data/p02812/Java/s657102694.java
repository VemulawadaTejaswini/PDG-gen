import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int count = 0;
    for(int i = 0; i < str.length()-2;str++){
      if(str.charAt(i).equals("A")){
        if(str.charAt(i+1).equals("B")){
          if(str.charAt(i+2).equals("C")){
            count++;
          }
        }
      }
    }
    System.out.println(count);
  }
}
