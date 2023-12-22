import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = 0;
        int w = 0;
        while(true){
            h = sc.nextInt();
            w = sc.nextInt();
            if(h == 0 && w == 0){break;}
            for(int i = 1; i <= h;i++){
                for(int j = 1; j <= w;j++){
                    if(i==1||i==h||j==1||j==w){
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println("");
            }
            System.out.println();
        }
    }
}
