import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int w=sc.nextInt();
    int s=sc.nextInt();
    int n=s/w;
    if(n>2) {
    	System.out.println("safe");
    }else {
    	System.out.println("unsafe");
    }
     }}