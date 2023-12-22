import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int work = 0;
        while(true){
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            if(num1 == 0 && num2 == 0){
                break;
            }else{
                if(num1 > num2){
                    work = num1;
                    num1 = num2;
                    num2 = work;
                    System.out.println(num1 +" "+ num2);
                }else{
                    System.out.println(num1 +" "+ num2);
                }
            }
        }
    }
}
