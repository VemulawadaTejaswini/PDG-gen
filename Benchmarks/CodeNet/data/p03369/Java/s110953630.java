import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String topping = sc.next();
    String[] li = topping.split("");
    int extra = 0;
    for(int i=0;i<li.length;i++){
      if(li[i].equals("o")){
        extra += 100;
      }
    }
    System.out.println(700+extra);
  }
}