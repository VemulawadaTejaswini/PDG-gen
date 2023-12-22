import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] element = br.readLine().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(element[i]);
        }
        
        int count = bubbleSort(a);

        StringBuilder output = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            output.append(a[i]);
            if (i != n-1) {
                output.append(" ");
            }
        }
        System.out.println(output.toString());
        System.out.println(count);
    }

    public static int bubbleSort (int[] a) {
        int i, j, temp;
        int n = a.length - 1;
        int count = 0;
        for (i = 0; i < n; i++) {
            for (j = n; j > i; j--) {
                if (a[j-1] > a[j]) {
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                    count++;
                }
            }
        }
        return count;
    }
}