import java.util.*;
public class Main{
  public static void main(String[] args) {
    int a;
    String s;
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    s = sc.nextLine();

    if(2800<=a && a<3200){

      if(3200<=a && 1<=s && s<=10){
        System.out.println(s);
      }else{
        System.out.println("red");
      }

    }
  }
}