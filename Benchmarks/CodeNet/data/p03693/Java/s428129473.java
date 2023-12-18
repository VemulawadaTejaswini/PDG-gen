import java.util.Scanner;
class Main
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int g = scan.nextInt();
        int b = scan.nextInt();
        int num = 100*r + 10*g + b;
        int cal = num % 4;
        if(cal == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}