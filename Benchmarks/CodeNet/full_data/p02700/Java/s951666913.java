import java.util.Scanner;
public class Main {
     public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        
        for(int i = 0; i < 100; i++){
            C = C - B;
            if(C <= 0){
                System.out.println("Yes");
                i = 101;
            }else{
                A = A - D;
                if(A <= 0){
                    System.out.println("No");
                    i = 101;
                }else{
                    //なし
                }
            }
        }
     }
    
}