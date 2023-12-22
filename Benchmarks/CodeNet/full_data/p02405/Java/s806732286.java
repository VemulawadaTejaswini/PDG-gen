import java.util.Scanner;
class Main{
    public static void addprint(int w){
        for(int i1 = 0; i1 < w; i1++){
            if(i1 % 2 == 0)System.out.print("#");
            else System.out.print(".");
        }
        System.out.println("");
    }
    public static void evenprint(int w){
        for(int i1 = 0; i1 < w; i1++){
            if(i1 % 2 == 1)System.out.print("#");
            else System.out.print(".");
        }
        System.out.println("");
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int h, w;
        while(true){
            h = scanner.nextInt();
            w = scanner.nextInt();
            if(h == 0 && w == 0)break;
            for(int i = 0; i < h; i++){
                if(i%2 == 0)addprint(w);
                else evenprint(w);
            }
            System.out.println("");
        }

    }
}

