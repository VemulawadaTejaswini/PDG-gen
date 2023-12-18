import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        
        double a = 0;
        for(int i = 1; i <= n; i++){
            if(i%2 == 1){
                a++;
            }
        }
        
        double d = a/n;
        System.out.println(d);
    }
}