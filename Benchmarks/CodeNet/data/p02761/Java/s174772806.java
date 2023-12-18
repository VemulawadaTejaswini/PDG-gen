import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int[] a = new int[n];
        boolean[] set = new boolean[n];
        int m = stdIn.nextInt();
        int s, c;
        boolean existFlag = true;
        for(int i=0; i<m; i++){
            s = stdIn.nextInt();
            c = stdIn.nextInt();

            if(set[s-1] && (a[s-1] != c)){
                System.out.println("-1");
                return;
            }

            set[s-1] = true;
            a[s-1] = c;
        }

        if(isAllZero(a)){
            System.out.println("-1");
            return;
        }

        int i=0;
        while(a[i] == 0){
            i++;
        }
        for(i=0; i<n; i++){
            if(set[i]){
                System.out.print(a[i]);
            }else{
                System.out.print(0);
            }
        }
    }

    static boolean isAllZero(int[] a){
        for(int i=0; i<a.length; i++){
            if(a[i] != 0){
                return false;
            }
        }
        return true;
    }
}