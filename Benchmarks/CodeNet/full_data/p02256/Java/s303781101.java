import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner  sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if(y<x) {
            int t=0;
            t=y;    y=x;    x=t;
        }
        int z = 0;
        for(int i=0;;i++){
            z = y % x;
            if(z==0){
                System.out.println(x);
                break;
            }else{
                y = x;  x = z;
            }

        }
            
        
    }
}
