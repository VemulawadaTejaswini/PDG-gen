import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        
        if(r<1200){
            System.out.print("ABC");
        }else if(r<2800){
            System.out.print("ARC"); 
        }else{
            System.out.print("AGC");
        }
    }
}