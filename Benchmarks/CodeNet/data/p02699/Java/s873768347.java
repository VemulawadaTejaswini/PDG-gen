import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int s=sc.nextInt();
    int w=sc.nextInt();
    int n=s/w;
    if(n>=1) {
    	System.out.println("safe");
    }else {
    	System.out.println("unsafe");
    }
     }}