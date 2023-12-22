import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn =  new Scanner(System.in);
        
        while(stdIn.hasNext()){
            int b = stdIn.nextInt();
            int r = stdIn.nextInt();
            int g = stdIn.nextInt();
            int c = stdIn.nextInt();
            int s = stdIn.nextInt();
            int t = stdIn.nextInt();
            
            if(b + r + g + c + s + t == 0){
                break;
            }
            
            System.out.println(100 + (r * 3 + b * 5) * 13 + c * 2  + (r + b) * 15 + g * 7 -((t - s - r * 3 - b * 5) * 3));
        }
    }
}

