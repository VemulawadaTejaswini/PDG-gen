import java.util.Scanner  ;
public class Main{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

while(true){
    int H = sc.nextInt();
    int W = sc.nextInt();
    if(H == 0 && W == 0){
        break;
    }
        for(int i= 0;i<W;i++){
            System.out.printf("#");
        }
        System.out.printf("\n");

        for(int j= 0;j<H-2;j++){
           System.out.printf("#");
           for(int k= 0;k<W-2;k++){
              System.out.printf(".");
                                }
            System.out.printf("#\n");
        
                                }

        for(int l= 0;l<W;l++){
            System.out.printf("#");
        }
        System.out.printf("\n\n");


    
}
}
}
