import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[2];
        for(int i = 0; i < 2; i++){
            a[i] = sc.nextInt();
        }
        sc.close();
        int[] b = new int[3];
        b[0] = a[0] + a[1];
        b[1] = a[0] - a[1];
        b[2] = a[0] * a[1];
        int MAX = MAX(b);
        System.out.println(MAX);
    }

    private static int MAX(int b[]){
        int MAX = b[0];
        if(b[0] < b[1]){
            MAX = b[1];
        }
        if(b[0] < b[2]){
            MAX = b[2];
        }
        return MAX;
    }
}