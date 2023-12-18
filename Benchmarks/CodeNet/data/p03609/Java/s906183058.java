import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    long X = sc.nextLong();
    long t = sc.nextLong();

    if(X<=t){
	System.out.println("0");
    }else{
	System.out.println(X-t);    
    }
}
}