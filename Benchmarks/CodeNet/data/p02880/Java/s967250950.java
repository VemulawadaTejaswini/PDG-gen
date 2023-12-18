import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A,numero = 0;
        boolean sw=false;
        numero=sc.nextInt();
        for (int j = 1; j <10 ; j++) {
            for (int k = 1; k <10 ; k++) {
                if ((j*k)==numero){
                    sw=true;
                }
            }
        }
        if (sw==true){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}