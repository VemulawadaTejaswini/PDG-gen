import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h,w;
        while(true){
            h = sc.nextInt();
            w = sc.nextInt();
            if(h == 0 && w == 0)break;
            for(int i = 0 ; i < h ; i++){
                for(int j = 0 ; j < w ; j++){
                    System.out.print("#");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}