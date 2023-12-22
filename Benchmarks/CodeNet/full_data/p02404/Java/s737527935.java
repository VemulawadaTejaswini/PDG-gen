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
                    if((j!=0&&j!=W-1)&&(i!=0&&i!=H-1)){
                        System.out.print(".");
                    }else{
                        System.out.print("#");
                    }
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
