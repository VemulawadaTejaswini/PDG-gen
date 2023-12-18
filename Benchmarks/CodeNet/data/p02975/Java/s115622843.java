import java.util.*;

public class Main{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i=0; i<n; i++) a[i] = sc.nextInt();

        if (a.length%3!=0) {
            System.out.println("No");
        }else {
            if ((a[0]^a[2])==a[1] && ((a[1]^a[0])==a[2]) && ((a[2]^a[1])==a[0])){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }

    }

}
