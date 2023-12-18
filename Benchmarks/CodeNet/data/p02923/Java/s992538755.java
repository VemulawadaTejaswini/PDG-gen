import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int N = in.nextInt();
        int actual = in.nextInt();
        for (int i = 1; i < N; i++) {
            int siguiente = in.nextInt();
            if(actual >= siguiente){
                count++;
            }else{
                count = 0;
            }
            
            actual = siguiente;
            
        }
        System.out.println(count);
                
    }
    
}