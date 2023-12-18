import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = stdIn.nextInt();
        }

        int c = a[0];
        int d = a[1];
        int e = a[2];

        for(int i = 3;i < n ;i++) {
            if(a[i] != c) {
                if(a[i] != d) {
                    if(a[i] != e) {
                        System.out.println("No");
                        System.exit(0);
                    } else {
                        e = a[i];
                    }
                } else {
                    d = a[i];
                }
            }
        }

        int f = c ^ d;
        if(f == e) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }





        
        
    }
}