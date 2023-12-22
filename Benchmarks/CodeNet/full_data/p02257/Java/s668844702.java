import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        PrimeNumber PN = new PrimeNumber();
        
        while(0 < a){
            if(PN.getPN(sc.nextInt())){
                PN.result++;
            }
            a--;
        }
        System.out.println(PN.getResult());
    }
}

class PrimeNumber{
    int result = 0;
    
    public boolean getPN(int a){
        if(a == 2){
            return true;
        }
        if(a < 2 || a % 2 == 0){
            return false;
        }
        
        int k = 3;
        for(int i = 3; i <= Math.sqrt(a); i += 2){
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public int getResult(){
        return result;
    }
}

