import java.util.*;

public class Main {
    public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
double N=sc.nextDouble();
double n=Math.floor(Math.sqrt(2*N))+1;
System.out.println(n*(n-1)==2*N?"Yes":"No");
    }
}