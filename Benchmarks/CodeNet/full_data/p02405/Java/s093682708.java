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
        for(int i = 0; i < h; i ++ ){
            if(i % 2 == 0){
                for(int j = 0; j < w; j ++){
                    if(j % 2 == 0)
                        System.out.print("#");
                    else
                        System.out.print(".");
                }
            }
            else{
                for(int j = 0; j < w; j ++){
                    if(j % 2 == 0)
                        System.out.print(".");
                    else 
                        System.out.print("#");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
