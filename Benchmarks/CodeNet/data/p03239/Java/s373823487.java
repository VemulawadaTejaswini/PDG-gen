import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int T = Integer.parseInt(sc.next());
        
        int minC = 10000;
        for(int i = 0; i < n; i++){
            int c = Integer.parseInt(sc.next());
            int t = Integer.parseInt(sc.next());
            if(t <= T && c < minC){
                minC = c;
            }
        }
        
        if(minC < 10000){
            System.out.println(minC);
        }else{
            System.out.println("TLE");
        }
    }
}