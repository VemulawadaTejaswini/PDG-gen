import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int h,w;
        while(true){
            h=scan.nextInt();
            w=scan.nextInt();
            if(h==0 && w==0)break;
            int a=0;
            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    if(a==0){
                        System.out.printf("#");
                        a=1;
                    }else if(a==1){
                        System.out.printf(".");
                        a=0;
                    }
                }
                if(w%2==0){
                    if(a==1)a=0;
                else a=1;
                }
                System.out.printf("\n");
            }
            System.out.printf("\n");
        }
    }
}
