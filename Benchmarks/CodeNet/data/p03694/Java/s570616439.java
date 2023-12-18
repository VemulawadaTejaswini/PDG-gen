import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int[] all=new int[n];
        int a=0;
        int b=10000;
        for(int i=0;i<n-1;i++){
            if(i==0){
                int c=sc.nextInt();
                a=c;
                b=c;
            }
            int c=sc.nextInt();
            if(a>c){
                a=c;
            }else if(b<c){
                b=c;
            }

        }
        System.out.println(b-a);
    }



}