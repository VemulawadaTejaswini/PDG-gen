import java.util.Scanner;

class Main{
    public static void main(String[] args){
    int i = 1;
    int x;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(++i <= n){
        x = i;
        if(x % 3 == 0){
            System.out.print(" " + i);
            continue;
        }
        while(true){
            if(x % 10 == 3){
                System.out.print(" " + i);
                break;
            }else{
                x /= 10;
                if(x != 0) continue;
                else break;
            }
        }

    }
    System.out.print("\n");
    }
}