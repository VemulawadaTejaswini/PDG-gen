import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h,w; //h=3, w=4
        while(true){
            h = sc.nextInt();
            w = sc.nextInt();

            if(w == 0 && h == 0) break;

            for(int i = 0 ; i < h ; i++){
                for(int j = 0 ; j < w ; j++) {
                System.out.print("#");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
