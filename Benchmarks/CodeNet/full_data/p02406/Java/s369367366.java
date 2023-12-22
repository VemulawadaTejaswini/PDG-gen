import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;

        for(int i = 1; i <= n; i++ ){
            if(i % 3 == 0){
                System.out.print(" " + i);
            }else{
                a = i;

            while(a > 0){
                if (a % 10 == 3){
                    System.out.print(" " + i);
                    break;
                }else{
                    a /= 10;
                }
            }
            }
        }
        System.out.println();
    }
}