import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    if(N<=9){
    System.out.println(N);
    }else if(N<=99){
    System.out.println("9");
    }else if(N<=999){
    System.out.println(N-99+9);
    }else if(N<=9999){
    System.out.println("909");
    }else if(N<=99999){
    System.out.println(N-9999+909);
    }else{
    System.out.println("90909");    
    }
}
}