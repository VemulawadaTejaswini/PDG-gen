import java.util.*;



class Main
    {
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            int count = 0;
            for(int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                if(a[i] >= k) count++;
            }
            System.out.println(count);
        }
    }
