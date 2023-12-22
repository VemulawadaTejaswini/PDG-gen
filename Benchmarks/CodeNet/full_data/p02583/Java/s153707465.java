import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();


        int cnt = 0;

        for (int i=0; i<n-2; i++) {
            for (int j=i+1; j<n-1; j++) {
                for (int k=j+1; k<n; k++) {
                    if (arr[i]==arr[j] || arr[j]==arr[k] || arr[k]==arr[i]) continue;
                    int[] tmp = new int[3];
                    tmp[0] = arr[i];
                    tmp[1] = arr[j];
                    tmp[2] = arr[k];
                    Arrays.sort(tmp);
                    if (tmp[0]+tmp[1]>tmp[2]) cnt++;
                }
            }
        }

        System.out.println(cnt);

    }


}

