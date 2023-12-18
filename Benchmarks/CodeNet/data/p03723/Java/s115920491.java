
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        int A=new Scanner(System.in).nextInt();
        int B=new Scanner(System.in).nextInt();
        int C=new Scanner(System.in).nextInt();
        int count=0;
        while(true){
            if(A%2==1){
                break;
            }else if(B%2==1){
                break;
            }else if(C%2==1){
                break;
            }
            if(A==B && B==C){
                count=-1;
                break;
            }
            int a=A;
            int b=B;
            int c=C;
            A=(b+c)/2;
            B=(a+c)/2;
            C=(a+b)/2;
            count+=1;
        }
        System.out.println(count);
    }
}

