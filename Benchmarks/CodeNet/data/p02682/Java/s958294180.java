import java.util.*;

class Main{
public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b = sc.nextInt();
  int c = sc.nextInt();
  int k = sc.nextInt();
  
  int sum = Math.min(a,k) + 0*(Math.min(k-Math.min(a,k),b)) + (-1)*(k-Math.min(a,k)-Math.min(k-Math.min(a,k),b));
  System.out.println(sum);
  
  sc.close();
}//void
}//class