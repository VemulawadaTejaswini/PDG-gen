import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
     
    int n = sc.nextInt();
    int d = sc.nextInt();
    int m=0;
    int i=0;
    while(i < n){ 
      long a = sc.nextLong();
      long b = sc.nextLong();
      i++;
      if(Math.sqrt(a*a + b*b)<=d) m++;
   
    }
    
    System.out.println(m);
  }
}