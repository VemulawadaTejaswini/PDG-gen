import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int a = 0; true; a++){
            for(int b = -1; cal(a, b) <= x; b--){
                if(x==cal(a, b)) {
                    System.out.println(a + " " + b);
                    sc.close();
                    return;
                } 
            }
            for(int b = 0; cal(a, b) >= x; b++){
                if(x==cal(a, b)){
                    System.out.println(a + " " + b);
                    sc.close();
                    return;
                }
            }
        }

        
    }

    private static long cal(long a, long b){
        return a * a * a * a * a - b * b * b * b * b;
    }
}