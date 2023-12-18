import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int k=scan.nextInt();
        int x=scan.nextInt();

        if(k==1){
            System.out.println(x);
        }else {
            for (int i = x-(k-1); i<=x+(k-1);i++){
                System.out.println(i);

            }
        }
    }
}
