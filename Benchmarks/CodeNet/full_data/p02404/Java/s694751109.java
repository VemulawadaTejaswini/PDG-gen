import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int w = input.nextInt();
        int h = input.nextInt();
        while(input.hasNext()){
            if(w != 0 && h != 0)
                draw(h, w);
            w = input.nextInt();
            h = input.nextInt();
        }
    }
    
    public static void draw(int w, int h){
        for(int i = 0; i < w; i++ )
            System.out.print("#");
        System.out.println();
        for(int j = 0; j < h-2; j++ ){
            System.out.print("#");
            for(int k = 0; k < w-2; k ++ )
                System.out.print(".");
            System.out.println("#");
        }
        for(int l = 0; l < w; l++ )
            System.out.print("#");
        System.out.println();
        System.out.println();
    }
}
