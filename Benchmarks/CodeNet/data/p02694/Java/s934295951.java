import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long x=sc.nextLong(),t=100,count=0;;
    while(t<x) {
    	t+=t*0.01;
    	//System.out.println(t);
    	count++;
    }
    System.out.println(count);
  }
}
