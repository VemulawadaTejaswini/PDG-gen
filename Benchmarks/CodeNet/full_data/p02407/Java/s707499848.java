import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp;
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        for(int j = 0; j < a.length/2; j++){
            tmp = a[j];
            a[j] = a[a.length - 1- j];
            a[a.length -1 - j] = tmp;
        }
        for(int k = 0; k < a.length; k++){
            System.out.printf("%d", a[k]);
            if(k < a.length - 1){
                System.out.printf(" ");
            }else{
                System.out.printf("\n");
            }
        }
        sc.close();
    }
}
