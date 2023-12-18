import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n,k;
  	n=sc.nextInt();
  	k=sc.nextInt();
  	while(n>n%k){
  		n%=k;
  	}
  	System.out.print(n);
  }
}