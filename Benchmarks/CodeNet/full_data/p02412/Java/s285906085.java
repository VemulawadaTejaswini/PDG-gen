import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        while(true){
            int n = scan.nextInt();
            int x = scan.nextInt();

            if(n == 0 && x == 0){
                break;
            }
            int num = 0;

            for(int i = 1; i < n; i++){
                for(int f = i+1; f < n ; f++){
                    for(int y = f+1; y <= n; y++){
                        if(i + f + y == x){
                           // System.out.println(i +" " + f + " " + y);
                            num++;
                        }
                    }
                }
            }
            
            System.out.println(num);
        }
    }
}

