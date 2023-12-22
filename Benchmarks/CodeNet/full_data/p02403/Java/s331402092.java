import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h,w;
        while(true){
            h = sc.nextInt();
            w = sc.nextInt();
            if(h==0) break;
            for(int i=0;i<h;i++){
                for(int l=0;l<w;l++){
                    System.out.print("#");
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
