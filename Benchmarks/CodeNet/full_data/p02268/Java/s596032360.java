import java.util.Arrays;

class Main {

    private static final int CONST= 1000000007;
    public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] S = new int[n];
        for(int i=0; i<n; i++)  S[i] = Integer.parseInt(sc.next());

        int q = Integer.parseInt(sc.next());
        int[] T = new int[q];
        for(int i=0; i<q; i++)  T[i] = Integer.parseInt(sc.next());

        int count = 0;
        for(int element : T){
            if(Arrays.binarySearch(S, element) >= 0)    count++;
        }
        System.out.println(count);
        sc.close();
    }
}
