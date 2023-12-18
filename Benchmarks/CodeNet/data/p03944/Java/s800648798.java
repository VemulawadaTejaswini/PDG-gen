import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x1=0;
        int y1=0;
        int W=s.nextInt();
        int H=s.nextInt();
        int total_area=W*H;
        int n=s.nextInt();
        while(n-->0){
            int x=s.nextInt();
            int y=s.nextInt();
            int a=s.nextInt();
            if(a==1){
                x1=x;
            }
            else if(a==2){
                W=x;
            }
            else if(a==3){
                y1=y;
            }
            else if(a==4){
                H=y;
            }
        }
        System.out.println((W-x1)*(H-y1));
    }
}
