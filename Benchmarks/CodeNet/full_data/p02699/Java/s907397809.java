import java.util.Scanner;
public class A164{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a<=b){
            System.out.println("unsafe");
        }
        else{
            System.out.println("safe");
        }

    }
}
