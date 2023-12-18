import java.util.ArrayList;
import java.util.Scanner;

/*
問題文

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int ans = 0;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int check = 0;

        for (int i = 0; i < n; i++) {

            if (i == 0) {
                ans = a[i];
            } else {
                ans = a[ans-1];
            }
            if (temp.contains(ans)) {
                check = temp.indexOf(ans);
            	break;
            }
            temp.add(ans);
        }

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = check; i < temp.size(); i++ ) {
        	list.add(temp.get(i));
        }

        if (temp.size() == k){
            System.out.println(ans);
        } else {
            int std = (int)(k % list.size());

            System.out.println(list.get(std-1-check));
        }
    }
}