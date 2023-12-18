import java.util.*;
class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    
    long X = sc.nextLong(); //next(文字列), nextDouble, nextLine(1行)とか

    long money = 100;
    int year = 0;
    while(money < X){
      money *=1.01;
      year++;
    }
    System.out.println(year);
        
  }
}
