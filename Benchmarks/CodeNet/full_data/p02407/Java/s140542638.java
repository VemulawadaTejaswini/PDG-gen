import java.util.Scanner;
public class Main {
    public static void main(final String[] args) {
     Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int[] array = new int[n];
        int i=0;
        for(i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        for(i=n-1;i>=1;i--){
            System.out.print(array[i]+" ");          
        }
        if(i==0){
            System.out.print(array[0]);
        }
        System.out.println();
    }
}
