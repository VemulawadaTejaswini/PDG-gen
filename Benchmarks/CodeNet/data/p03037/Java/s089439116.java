import java.util.Scanner;

public final class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int m = stdIn.nextInt();
        int[] l = new int [m];
        int[] r = new int [m];

        for(int i=0; i<m; i++){
            l[i] = stdIn.nextInt();
            r[i] = stdIn.nextInt();
        }

        int min = 0;
        int max = n-1;

        for(int i=0; i<m; i++){
            if(min<l[i]-1){
                min = l[i]-1;
            }
            if(r[i]-1<max){
                max = r[i]-1;
            }
        }

        if(min<=max){
            System.out.println(max-min+1);
        }else{
            System.out.println(0);
        }
    }
}