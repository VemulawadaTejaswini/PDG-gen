import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int n = A;
        
        for(int i = A; i < B + 1 ; i++){
            if(i % K == 0){
                System.out.println("OK");
                i = B + 1;
            }else{
            if(n == B){
                System.out.println("NG");
            }
            n++;
            }
        }
    
    }    
}