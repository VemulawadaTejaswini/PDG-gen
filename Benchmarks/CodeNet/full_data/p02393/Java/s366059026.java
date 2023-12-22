import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] num = str.split(" ",0);
        int[] a  = new int[3];
        int i,j;

        a[0] = Integer.valueOf(num[0]);
        a[1] = Integer.valueOf(num[1]);
        a[2] = Integer.valueOf(num[2]);

        for (i = 2;i > 0; i--){
            for(j = 0;i > j;j++){
                if(a[j]>a[j+1]){
                    swap(a, j+1);
                }
            }
        }
        System.out.println(a[0]+" "+a[1]+" "+a[2]);

        scan.close();
    }
    public static void swap(int[] a,int b){
        int temp;
        temp = a[b];
        a[b] = a[b-1];
        a[b-1] = temp;
    }
}

