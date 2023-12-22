
import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int w = scan.nextInt();
        
        while(w != -1){
            int total = 0; 
            
        if (w <= 10 )  {
            System.out.println(4280 -1150);
        
        } else if (10 < w && w <= 20){
            System.out.println(4280 - (1150 + (w-10) * 125));
        
        } else if (20 < w && w <= 30){
            System.out.println(4280 - (1150 + 125 * 10 + (w-20) * 140));
            
        } else if (30 < w){
            System.out.println (4280 - (1150 + 125 * 10 + 140 * 10 + ((w-30) * 160)));
        }
       w = scan.nextInt();
    }  
}
}
