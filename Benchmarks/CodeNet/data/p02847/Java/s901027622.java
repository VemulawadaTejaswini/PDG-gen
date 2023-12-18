import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String dofw = sc.next();
    System.out.println(7 - dnum(dofw));
  }
  public static int dnum(String day){
    String[] dsofw = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
    for(int i = 0; i< 7; i++){
      if(day == dsofw[i]){
        return i;
      }
    }
  }
}