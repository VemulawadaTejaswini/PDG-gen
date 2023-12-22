import java.util.*;

public class Main {
    public static void main(String[] argv) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        input=new Scanner(System.in);
        int[] data=new int[n];
        for (int i=n-1; i>=0; i--) {
            data[i]=input.nextInt();
        }
        for (int i : data) {
            System.out.printf("%d ",i);
        }
        System.out.printf("\n");
    }
}