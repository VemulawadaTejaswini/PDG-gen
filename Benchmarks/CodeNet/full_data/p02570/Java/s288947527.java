import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        var sc = new Scanner(System.in);
    
        int d = Integer.parseInt(sc.next());
        int t = Integer.parseInt(sc.next());
        int s = Integer.parseInt(sc.next());
        
        if(s*t >= d){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}