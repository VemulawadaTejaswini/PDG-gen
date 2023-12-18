import java.util.Scanner;

public final class Main {
    public static void main(String[] args){

        Scanner stdIn = new Scanner(System.in);

        int R = stdIn.nextInt();
        int G = stdIn.nextInt();
        int B = stdIn.nextInt();
        int N = stdIn.nextInt();

        int counter = 0;

        for(int r=0; r<=(N/R)+1; r++){
            if(r*R>N || R == 0){
                break;
            }
            for(int g=0; g<=(N/G)+1; g++){
                if(r*R+g*G>N || G == 0){
                    break;
                }
                for(int b=0; b<=(N/B)+1; b++){
                    if(r*R+g*G+b*B>N || B == 0){
                        break;
                    }
                    if(r*R+g*G+b*B == N){
                        counter++;
                    }
                }
            }
        }

        System.out.println(counter);
    }
}
