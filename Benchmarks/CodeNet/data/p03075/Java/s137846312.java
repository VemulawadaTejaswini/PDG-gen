import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b[] = new int[6];
        int count = 0;

        for (int i = 0; i < 6; i++) {
            b[i] = scan.nextInt();
        }

        if( (b[1]-b[0]> b[5]) || (b[2]-b[0] > b[5]) || (b[3]-b[0] > b[5]) || (b[4]-b[0] > b[5]) ){
            count = 1;
        }

        if( (b[2]-b[1] > b[5]) || (b[3]-b[1] > b[5]) || (b[4]-b[1] > b[5]) ){
            count = 1;
        }

        if( (b[3]-b[2] > b[5]) || (b[4]-b[2] > b[5]) ){
            count = 1;
        }

        if( (b[4]-b[3] > b[5]) ){
            count = 1;
        }

        if(count == 0){            
            System.out.println("Yay!");
        }
        else{
            System.out.println(":(");
        }
    }
}