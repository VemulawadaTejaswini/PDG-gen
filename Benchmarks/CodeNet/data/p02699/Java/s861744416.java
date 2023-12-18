import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double s=sc.nextDouble();
    double w=sc.nextDouble();
    double n=s/w;
    if(n>2) {
    	System.out.println("safe");
    }else {
    	System.out.println("unsafe");
    }
     }}