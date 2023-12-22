import java.util.Scanner;

class Main{
    public static void main(String[] args) throws Exception{

        int num = 10000;

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= num; i++) {
            int x = sc.nextInt();
            if(x == 0){
                break;
            }
            System.out.println("Case "+ i + ": " + x);
        }


    }
}