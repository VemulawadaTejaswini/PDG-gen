import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int c = b-a;
    int B = 0;
    for(int i=1; i<=c; i++){
        B += i;
}
    System.out.println(B-b);    
    }
}