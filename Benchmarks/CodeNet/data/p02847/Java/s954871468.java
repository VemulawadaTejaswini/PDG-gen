import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    if(s=="SUN") System.out.println(7);
    else if(s=="MON") System.out.println(6);
    else if(s=="TUE") System.out.println(5);
    else if(s=="WED") System.out.println(4);
    else if(s=="THU") System.out.println(3);
    else if(s=="FRI") System.out.println(2);
    else if(s=="SAT") System.out.println(1);
}
}
