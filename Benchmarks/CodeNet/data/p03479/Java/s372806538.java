import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = Long.parseLong(sc.next());
        long Y = Long.parseLong(sc.next());
        
        int count = 1;
        
        while(X*2 < Y){
            X = X*2;
            count++;
        }
        
        System.out.println(count);
    }
    
}