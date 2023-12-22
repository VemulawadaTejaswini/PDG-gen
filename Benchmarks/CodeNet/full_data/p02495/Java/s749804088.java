import java.util.Scanner;
 
public class Main{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        while(true){
            int a = scn.nextInt();
            int b = scn.nextInt();
            if(a==0&&b==0) break;
            for(int i=0; i<a; i++){
                for(int j=0; j<b; j++){
                    if((i%2 + j%2)%2 == 1){
                        System.out.printf(".");
                    }else{
                        System.out.printf("#");
                    }
                }
                System.out.printf("\n");
            }
            System.out.printf("\n");
        }
    }
}