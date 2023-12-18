import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a = 0;
                int b=0; int c=0; int d=0;
        for(int i = 0; i <4;++i) {
            int temp= sc.nextInt();
            if(temp == 1) {
                a = 1;
            }else if(temp == 9) {
                b = 1;
            }else if(temp == 7) {
                c = 1;
            }else if(temp == 4) {
                d = 1;
            }
                
        }
        if((a+b+c+d) == 4) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }

}
