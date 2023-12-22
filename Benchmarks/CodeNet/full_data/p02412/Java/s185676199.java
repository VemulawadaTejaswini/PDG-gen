import java.util.Scanner;

public class Main {
    private static int nCombination3(int[] list,int aim) {
        int count = list.length;
        int num = 0;
        int ans=0;
        int ansNum=0;
        for (int i = 0; i < count - 2; i++) {
            for (int j = i + 1; j < count - 1; j++) {
                for (int k = j + 1; k < count; k++) {
                    num++;
                    ans = list[i]+list[j]+list[k];
                    if(ans == aim)ansNum++;
                }
            }
        }
        return ansNum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        int x = 0;
        int[] A;
        int[] ans;
        ans = new int[50];
        int i = 0;
        while (true) {
            n = scan.nextInt();
            if (n == 0)
                break;
            A = new int[n];
            for (int k = 0; k < n; k++) {
                A[k] = k + 1;
            }
            x = scan.nextInt();
            ans[i] = nCombination3(A,x);
            i++;
        }
        for (int j = 0; j < i; j++) {
            System.out.println(ans[j]);
        }
        return;
    }
}
