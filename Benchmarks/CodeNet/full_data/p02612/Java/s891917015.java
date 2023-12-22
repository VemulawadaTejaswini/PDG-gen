import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try(Scanner sc = new Scanner(System.in);){
            System.out.println(new Main().run(sc));
        }
    }
    
    private String run(Scanner sc){
        int n = Integer.parseInt(sc.next());
        while(n > 0){
            n -= 1000;
        }
        return Integer.toString(Math.abs(n));
    }
    
}
