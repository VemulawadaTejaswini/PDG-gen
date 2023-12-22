import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, x;
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            x = i;
            if(i%3 == 0){
                System.out.print(" " + i);
                continue;
            }
            while(true){
                if(x%10 == 3){
                    System.out.print(" " + i);
                    break;
                }
                x /= 10;
                if(x<1) break;
            }
        }
        System.out.println();
    }
}
