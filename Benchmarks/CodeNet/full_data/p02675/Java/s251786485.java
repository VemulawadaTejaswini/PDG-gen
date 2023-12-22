import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int judge = 0;
        
        if(N<10){
            if(N == 3){
                judge = 3;
            }else if(N == 0 ||N == 1 ||N == 6 ||N == 8){
                judge = 2;
            }else{
                judge = 1;
            }
        }else{
            if(N%10 == 3){
                judge = 3;
            }else if(N%10 == 0 ||N%10 == 1 ||N%10 == 6 ||N%10 == 8){
                judge = 2;
            }else{
                judge = 1;
            }
        }
        
        if(judge == 1) System.out.println("hon");
        if(judge == 2) System.out.println("pon");
        if(judge == 3) System.out.println("bon");
    }
}