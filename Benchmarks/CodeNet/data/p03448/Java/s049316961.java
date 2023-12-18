import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();
        int x = stdIn.nextInt();
        int count = 0;
        
        for(int i = 0; i <= a; i++){
            if(i * 500 > x){
                break;
            }
            for(int j = 0; j <= b; j++){
                if(i * 500 + j * 100 > x){
                    break;
                }
                for(int k = 0; k <= c; k++){
                    if(i * 500 + j * 100 + k * 50 > x){
                        break;
                    }
                
                    if(i * 500 + j * 100 + k * 50 == x){
                        count++;
                        break;
                    }
                }
            }
        }
        
        System.out.println(count);
    }
}
