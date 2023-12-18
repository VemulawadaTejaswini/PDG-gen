import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        boolean check = false;

        for(int i=1; A*i<=A*B; i++){
            if ((A*i) % B == C ){
                check = true;
                break;
            }   
        }
        
        if(check == true){
            System.out.println("YES");
        }
        
        else{
            System.out.println("NO");
        }
    }
}
