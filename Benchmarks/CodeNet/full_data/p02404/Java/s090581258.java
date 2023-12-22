import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h,w;
        while(true){
            h = sc.nextInt();
            w = sc.nextInt();
            if(h==0) break;
            for(int l=0;l<w;l++){
                System.out.print("#");
            }
            System.out.print("\n");
            for(int i=1;i<h-1;i++){
                System.out.print("#");
                for(int l=1;l<w-1;l++){
                    System.out.print(".");
                }
                System.out.print("#");
                System.out.print("\n");
            }
            for(int l=0;l<w;l++){
                System.out.print("#");
            }
            System.out.println("\n");
        }
        sc.close();
    }
}
