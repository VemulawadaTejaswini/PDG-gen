import java.util.Scanner;                                                                     
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(true){
            int h = in.nextInt();
            int w = in.nextInt();
            if(h == 0 && w == 0){
                break;
            }
            for(int i=0; i<h; i++){
                for(int j=0; j<w; j++){
                    if(i == 0 || i == h-1){
                        System.out.print("#");
                    }else if(j == 0 || j == w-1){
                        System.out.print("#");
                    }else{
                    System.out.print(".");
                    }
                }
                System.out.print("\n");
            }
            System.out.print("\n");
         }
     }
}               