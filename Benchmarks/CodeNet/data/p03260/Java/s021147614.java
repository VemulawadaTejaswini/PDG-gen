import java.util.*; 
public class Main {

  public static void main(String[] args) {
  
  Scanner sc=new Scanner(System.in);
  int a[]=new int[3];
  a[0]=sc.nextInt();
  a[1]=sc.nextInt();



  System.out.println(!(a[1]*a[0]%2==0)?"Yes":"No");
  }
  
}