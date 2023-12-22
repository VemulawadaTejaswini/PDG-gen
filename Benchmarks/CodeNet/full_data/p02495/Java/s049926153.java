import java.util.Scanner;

public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int a,b;
                while(true){
                        int h = sc.nextInt();
                        int w = sc.nextInt();
                        if(h==0 && w==0) break;
                        for(a=1;a<=h;a++){
                                if(a/2.0!=0){
                                        for(b=1;b<=w;b+=2){
                                                System.out.printf("#");
                                                if(w-b>0)
                                                        System.out.printf(".");
                                        }
                                        System.out.printf("\n");
                                }else{
                                       for(b=1;b<=w;b+=2){
                                                System.out.printf(".");
                                                if(w-b>0)
                                                        System.out.printf("#");
                                        }
                                        System.out.printf("\n");
                                }
                        }
                        System.out.printf("\n");
                }
        }
}