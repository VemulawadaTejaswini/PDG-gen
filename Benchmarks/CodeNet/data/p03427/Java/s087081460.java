import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
    }
    
    public Main(){
        Scanner s = new Scanner(System.in);
        char[] N = s.next().toCharArray();
        int zero = 0;
        for(int i = N.length - 1; i > 0; i--){
            if(zero == 1){
                N[i] = '9';
                zero = 0;
            }else if(N[i] < '9'){
                N[i] = '9';
                N[i-1] -= 1;
            }
            
            if(N[i-1] == '0'){
                zero = 1;
            }
            System.out.println(N);
        }
        
        int max = 0;
        for(int i = 0; i < N.length; i++){
            max += N[i] - '0';
        }
    }
    
}