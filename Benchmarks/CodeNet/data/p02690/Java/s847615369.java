import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int ansA=0;
        int ansB=0;
        Out:
        for(int A=0;A<300;A++){
            for(int B=-300;B<300;B++){
                if(A*A*A*A*A - B*B*B*B*B == X){
                    ansA=A;
                    ansB=B;
                    break Out;
                }
            }
        }
        System.out.println(ansA+" "+ansB);
    }
}
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int ansA=0;
        int ansB=0;
        Out:
        for(int A=0;A<300;A++){
            for(int B=-300;B<300;B++){
                if(A*A*A*A*A - B*B*B*B*B == X){
                    ansA=A;
                    ansB=B;
                    break Out;
                }
            }
        }
        System.out.println(ansA+" "+ansB);
    }
}
