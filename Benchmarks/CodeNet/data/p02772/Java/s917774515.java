
import java.util.*;


class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=s.nextInt();
        }
        String ret="APPROVED";
        for (int i = 0; i < n; i++) {
            if(a[i]%2==0&&(a[i]%3!=0&&a[i]%5!=0)){
                ret="DENIED";
                break;
            }

        }

        System.out.println(ret);

    }
}