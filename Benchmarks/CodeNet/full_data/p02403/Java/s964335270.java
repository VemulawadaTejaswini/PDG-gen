import java.util.Scanner;                                                                     
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int w = in.nextInt();
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
            System.out.print("#");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        System.out.print("\n");
    }
}