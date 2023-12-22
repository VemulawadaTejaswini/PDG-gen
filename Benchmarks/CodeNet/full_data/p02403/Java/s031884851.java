import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int h, w;

        while(true){
            h = scanner.nextInt();
            w = scanner.nextInt();
            if(h == 0 && w == 0)break;
            for(int i = 0; i < h; i++){
                for(int j = 0; j < w; j++)System.out.print("#");
                System.out.println("");
            }
        }
    }
}

