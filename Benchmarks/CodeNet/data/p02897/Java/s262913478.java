import java.util.*;

public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   
    int N  = sc.nextInt();
    double h = (double)(N-2) / (double)N;
   
   System.out.println(String.format("%.10f",h));
    }
}