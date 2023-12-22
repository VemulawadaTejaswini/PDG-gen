import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int i,j,k,x,y;
        for(i=0;;i++){
            x=sc.nextInt();
            System.out.print(" ");
            y=sc.nextInt();
            if((x==0)&&(y==0)){
                break;
            }
            for(j=0;j<x;j++){
                for(k=0;k<y;k++){
                    System.out.print("#");
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
    }
}
