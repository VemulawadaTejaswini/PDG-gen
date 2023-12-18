import java.util.*;
public class Main{
public static void main(String[] args){
  Scanner obj=new Scanner(System.in);
  int h_l=obj.nextInt();
  int w=obj.nextInt();
  int c=2*w;
  int u=Math.abs(h_l-c);
  System.out.println(u);
}

}