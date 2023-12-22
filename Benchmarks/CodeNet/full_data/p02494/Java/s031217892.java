import java.util.Scanner;
 
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(1){
           int h = sc.nextInt();
           int w = sc.nextInt();
           if(w*h=0){break;}
            for(int i=0;i<h;i++){
 
                for(int j=0;j<w;j++){
 
                System.out.print("#");
                }
 
            System.out.printf("\n");
         
        }
        System.out.printf("\n");
        }
    }
}