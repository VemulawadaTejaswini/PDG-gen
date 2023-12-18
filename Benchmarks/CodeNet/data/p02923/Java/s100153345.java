import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int height[] = new int[n];

        for (int i = 0; i < n; i++)
            height[i]=scanner.nextInt();

        int max=0;
        for (int i = 0; i < n-1; i++) {
            int j = i+1,k=i;
            int localCount=0;
            while (j<n && height[k]>=height[j]){
                localCount++;
                k=j;j++;
            }
            max = Math.max(localCount,max);
        }

        System.out.println(max);
    }
}
