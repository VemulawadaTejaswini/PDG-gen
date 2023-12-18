import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
      	//System.out.println(N);
      	//System.out.println(A);
        //System.out.println(B);
        int a = N/(A+B);
        int b = N%(A+B);
        //System.out.println(a +""+ b);
        if(b-A > A){
            System.out.print(A*a+A);
        }else{
            System.out.print(A*a+b);
        }
    }
}