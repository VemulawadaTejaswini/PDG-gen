import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  int n=sc.nextInt()*sc.nextInt();
  int []po=new int[]{1,1,3,2};
  System.out.println(po[n%5]);
}
}
