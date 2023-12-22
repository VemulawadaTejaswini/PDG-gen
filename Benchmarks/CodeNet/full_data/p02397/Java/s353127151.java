import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        do{
            int a = scan.nextInt();
            int b = scan.nextInt();

            if (a == 0 && b == 0)
                break;
    
            if (a > b){
                int tmp = a;
                a = b;
                b = tmp;
            }

            System.out.println(a + " " + b);
        }while(true);
    }
}

    