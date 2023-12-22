import java.util.Scanner;
  
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h,w;
        
        while((h = sc.nextInt()) != 0){
            w = sc.nextInt();
            
            for(int i=0;i<w;i++){
                System.out.printf("#");
            }
            System.out.printf("\n");
            
            for(int i=1;i<h-1;i++){
                System.out.printf("#");
                for(int j=1;j<w-1;j++){
                    System.out.printf(".");
                }
                System.out.printf("#\n");
            }
            
            for(int i=0;i<w;i++){
                System.out.printf("#");
            }
            System.out.printf("\n\n");
        } 
    }
}