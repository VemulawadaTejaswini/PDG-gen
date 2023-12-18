import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i] = scan.nextInt();
        }
        String str = a.toString();
        for (int i=0;i<n;i++){
            String temp = Integer.toString(a[i]);
            if (str.contains((temp)) {
                System.out.println("NO");
                break;
            }
        }
        System.out.println("YES");
    }
}
