import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),count=0;
    long h=sc.nextLong(),w=sc.nextLong();
    for(int i=0;i<n;i++) {
    	long buffh=sc.nextLong(),buffw=sc.nextLong();
    	if(buffh>=h&&buffw>=w)count++;
    }
    System.out.println(count);
  }
}
