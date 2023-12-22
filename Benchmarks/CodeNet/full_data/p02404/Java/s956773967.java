import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int h = sc.nextInt();
            int w = sc.nextInt();
            if(h == 0 && w == 0) break;
            for(int i=1;i<=h;i++){
                if(i == 1 || i == h){
                    for(int j=1;j<=w;j++){
                        System.out.printf("#");
                    }    
                }else{
                    System.out.printf("#");
                    for(int j=1;j<=w-2;j++){
                        System.out.printf(".");
                    }
                    System.out.printf("#");
                }
            System.out.println();
            }
        System.out.println();
        }
    }
}
