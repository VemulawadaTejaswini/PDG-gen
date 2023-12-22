import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();
        int tail = n - (n / 10)*10;

        switch(tail){
            case 0:
            case 1:
            case 6:
            case 8:
                System.out.println("pon");
                break;
            case 2:
            case 4:
            case 5:
            case 7:
            case 9:
                System.out.println("hon");
                break;
            case 3:
                System.out.println("bon");
            default:
                break;
        }
    }
}