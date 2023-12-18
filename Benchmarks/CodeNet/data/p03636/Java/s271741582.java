import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	ch[] ch=sc.next().toCharArray();
    int n=ch.length;
    System.out.println(ch[0]+(n-2)+ch[n-1]);
  }
}
