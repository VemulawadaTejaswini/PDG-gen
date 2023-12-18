import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n=sc.nextLong(),m=sc.nextLong(),res=0;
    if(n*2>=m) {
    	System.out.println(m/2);
    }else {
    	m=m-n*2;
    	System.out.println(n+m/4);
    }
  }
}
