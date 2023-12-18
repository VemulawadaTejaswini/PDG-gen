import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final int A = scan.nextInt();
        final int B = scan.nextInt();
        scan.close();
        int result = 1;
        if(A >= B){
        }
        else{
            while(true){
                if(A * result - (result - 1) >= B){
                    break;
                }
                result++;
            }
           
        }
        System.out.println(result);
        
    }
    
}
