import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    
    int e = B-A;
    
    if(e<=0){
    System.out.println("delicious");
    }else if(e<=X){
    System.out.println("safe");
    }else{
    System.out.println("dangerous");
    }
    }
}