import java.util.*;
class Main{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int a,b,c,d;
  a = sc.nextInt();
  b = sc.nextInt();
  c = sc.nextInt();
  d = sc.nextInt();
  if((a*c) > (b*d))System.out.println(a*c);
  else System.out.println(b*d);
}

}