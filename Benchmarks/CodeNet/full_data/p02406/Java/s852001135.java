import java.util.Scanner;
public class Main{
    private static Scanner input;
    public static void main(String[] args){
         input = new Scanner(System.in);
         for (;;){
             int h = input.nextInt();
             int w = input.nextInt(); 
             if ( h ==0 || w ==0){
                 break;
             }
             if(h>=1 && w<=300){
                    for (int i=0;i<h;i++){
                        for (int j=0;j<w;j++){
                            if( (j+i)%2==1){
                                System.out.print(".");
                            }
                            else
                                System.out.print("#");
                            }   
                        System.out.println();
                    }
                    System.out.println();
                        }
             }
         }   
    }