import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        int[] b = new int[N-1];
        for(int i = 0; i < N - 1; i++){
            b[i] = scan.nextInt();
        }
        scan.close();
        int result = b[0];
        for(int i = 0; i < N - 2; i++){
            if(b[i] > b[i+1]){
                result += b[i+1];
            }else{
                result += b[i];
            }
        }
        result += b[N - 2];
        System.out.println(result);
        
    }
    
}
