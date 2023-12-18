import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        int M=0,A=0,R=0,C=0,H=0;
        N = sc.nextInt();
        ArrayList<String> List = new ArrayList<String>();
        for (int a = 0; a < N; a++) {
            String name = sc.next();
            if(name.indexOf("M")==0){
                M++;
            }
            else if(name.indexOf("A")==0){
                A++;
            }
            else if(name.indexOf("R")==0){
                R++;
            }
            else if(name.indexOf("C")==0){
                C++;
            }
            else if(name.indexOf("H")==0){
                H++;
            }
        }
        int num = M*A*R*C*H;
        int num2 = num/M;
        num2 = num2/A;
        num2 = num2/R;
        num2= num2/C;
        num2 = num2/H;
        System.out.println(num2);
    }
}
