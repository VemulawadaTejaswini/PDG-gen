import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc =  new Scanner(System.in);
  int ab = sc.nextInt();
  int bc = sc.nextInt();
  int ca = sc.nextInt();
  int  abc= ab+bc;
  int  bca= bc+ca;
  int  cab= ca+ab;
  if(abc>bca)
    if(abc>cab) System.out.println(abc);
    else if(bca>cab)System.out.println(bca);
    else System.out.println(cab);
}
}