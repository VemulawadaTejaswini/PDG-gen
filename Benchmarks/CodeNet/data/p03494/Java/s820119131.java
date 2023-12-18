import java.util.Scanner;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        int[] a = new int[n];
        while( a[n] % 2 == 0 ){
            a[n] /= 2; 
        }
        System.out.println(count);
    }
}