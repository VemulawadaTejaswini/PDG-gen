import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int A = 0;
        for(int i = 0; i < 3; i++){
            A  += sc.nextInt();
        }
        if(A <= 21){
            System.out.println("win");
        }else{
            System.out.println("bust");
        }
    }
}