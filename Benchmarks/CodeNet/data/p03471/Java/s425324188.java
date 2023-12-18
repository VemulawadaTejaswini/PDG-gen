import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int Y=scanner.nextInt();
        for(int x=0;x<(Y/1000-N)/9+1;x++){
            if((Y/1000-N-9*x)%4==0){
                int y=(Y/1000-N-9*x)/4;
                int z=N-x-y;
                if(z>=0){

                    System.out.println(String.format("%d %d %d",x,y,z));
                    return;
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}
