
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            int n = scan.nextInt();
            int y = 0;
            
            for(int a = 0;a<10;a++){
            for(int b = 0;b<10;b++){
            for(int c = 0;c<10;c++){
            for(int d = 0;d<10;d++){
                if(a+b+c+d==n){
                    y++;
                }
                }
            }
            }
            }
                System.out.println(y);
        }
    }
    }

