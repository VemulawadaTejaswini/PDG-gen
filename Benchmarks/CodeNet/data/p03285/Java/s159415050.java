import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num<4){
            System.out.println("No");
            System.exit(0);
        }

        if(num%4==0 | num%7==0){
            System.out.println("YES");
        }else{
            int num2 = num%4;
            int num3 = num%7;
            if(num2%4==0 | num3%7==0 | num2%7==0 | num3%4==0){
                System.out.println("YES");
                System.exit(0);
            }
            System.out.println("No");
        }
    }
}