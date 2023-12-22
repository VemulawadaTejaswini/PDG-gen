import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int H,W;
        int i,j;
        while(true){
            H=sc.nextInt();
            W=sc.nextInt();
            if(H==0&&W==0) break;
            for(i=0;i<H;i++){
                for(j=0;j<W;j++){
                    System.out.print("#");
                }
                System.out.println("");
            }
        }
    }
}
