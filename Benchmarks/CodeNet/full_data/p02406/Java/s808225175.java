import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x;

        for(int i = 1; i <= n; i++){
            x = i;
            if(x % 3 == 0){
                System.out.print(" "+i);
                continue;
            }
            while(true){
                if(x%10==3){
                    System.out.print(" "+i);
                    break;
                }
                if(x/10 == 0)break;
                else x/= 10;
            }
        }
        System.out.println("");
    }
}

