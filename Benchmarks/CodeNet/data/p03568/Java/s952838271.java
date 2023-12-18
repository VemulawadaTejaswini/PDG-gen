import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int counte = 0;
        for(int i = 0; i < n; i++){
            if(a[i] % 2 == 0){
                counte++;
            }
        }
        double allpattern = Math.pow(3,n);
        double allodd = Math.pow(2,counte);
        int allp = (int)allpattern;
        int allo = (int)allodd;
        System.out.print(allp-allo);
    }
}