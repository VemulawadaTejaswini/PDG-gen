import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        for(;;){
            int h = sc.nextInt();
            int w = sc.nextInt();
            if ((h == 0) && (w == 0)) break;
            sc.nextLine();
            for(int i=0 ; i<h ; i++){
                for(int j=0 ; j<w ; j++){
                    System.out.print("#");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
