import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    boolean test = true;
    
    for(int i=1; test; i++){
        if((A*i)%B == C){
            test = false;
            break;
        }else if((A*i)%B == 0){
            //System.out.println("C");
            break;
        }else{
            
        }
    }
    if(!test){
        System.out.println("YES");
    }else{
        System.out.println("NO");
    }
    }
}