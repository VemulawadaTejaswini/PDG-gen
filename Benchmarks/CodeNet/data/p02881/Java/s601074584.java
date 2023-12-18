import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int min =N;
        int [][] M = new int [N][N];
        for(int i =1; i<N; i++){
                 for(int j =1; j<N;j++){
                    if(i*j == N){
                        if(min > (i-1)+(j-1)){
                                min = (i-1)+(j-1);
                        }
                    }
            }   
        }   
        
        System.out.println(min);    
    }    
}