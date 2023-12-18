import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int add = A + B;
        int sub = A - B;
        int mul = A * B; 
        int max;
        
        if(add >= sub && add >= mull){
            max = add;
        }else if(sub >= add && sub >= mul){
            max = sub;
        }else(mul >= add && muol >= sub){
            max = mul;
        }
        System.out.println(max);
    }
}
 