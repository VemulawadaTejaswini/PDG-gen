import java.util.Scanner;
class Airc {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if(num>=30){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}