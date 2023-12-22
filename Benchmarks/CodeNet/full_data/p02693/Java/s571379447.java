import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int k = s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();
        boolean v =true;
        for(int i=a;i<=b;i++){
            if(i%k==0){
                System.out.println("OK");
                v = false;
                break;
            }

        }
        if(v==true){
            System.out.println("NG");
        }
    }
}
