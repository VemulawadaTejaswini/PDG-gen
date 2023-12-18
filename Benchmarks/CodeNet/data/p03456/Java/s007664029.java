import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b = sc.nextInt();
  if(b%10 == 0){int c = 10*a + b;}
  else if(b%10 >0 && b%10 <=9){int c = 100*a + b;}
  else{int c = 1000*a + b;}
  int d = (int)Math.sqrt((double)c);
  if(d*d == c){System.out.println("Yes");}
  else {System.out.println("No");}
}
}