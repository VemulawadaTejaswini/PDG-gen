import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    StringBuilder s=new StringBuilder(sc.next());
    int sum=0,count=0;
    for(int i=s.length();i>0;i--) {
    	if(s.substring(i-1, i).equals("B")) {
    		sum+=(s.length()-count)-i;
    		count++;
    	}
    }
    System.out.println(sum);
  }
}
