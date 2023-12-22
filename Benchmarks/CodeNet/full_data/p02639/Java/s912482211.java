
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int[] a = new int[5];
        for(int i=0;i<5;i++){
            a[i]=scn.nextInt();
            if(a[i]==0){
                System.out.println(i+1);
                return;
            }
        }

        scn.close();

    }

}