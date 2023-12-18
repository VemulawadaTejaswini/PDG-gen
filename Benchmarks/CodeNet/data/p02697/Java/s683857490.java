import java.util.*;
public class Main {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        for(int i= 1;i<=M ; i++ ){
            System.out.print(i);
            System.out.print(" ");
            System.out.print(2*M-i+1);
            System.out.println("");
        }
    }
}