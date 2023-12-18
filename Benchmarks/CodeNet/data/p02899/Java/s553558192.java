import java.util.Scanner;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scr = new Scanner(System.in);
        int s =scr.nextInt();
        int[] ip= new int[s];
        for(int i=0;i<s;i++){
            ip[i]= scr.nextInt();
        }
        int[] op= new int[s];
        for(int i=0;i<s;i++){
            op[ip[i]-1]=i+1;
        }
        for (int g: op
             ) {
            System.out.print(g+" ");
        }
    }
}
