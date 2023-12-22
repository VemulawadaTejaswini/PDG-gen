import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m[] = new int[n],l[]=new int[n], c = 0;
        boolean[] t=new boolean[n];
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
            l[(i+m[i])%n]++;
        for(int i=0;i<n;i++) {
            int j=i;
            while(!t[j]&&l[j]==0) {
                t[j]=true;
                j=(j+m[j])%n;
                l[j]--;
            }
        }
        for(int i:m)
            c+=i>0?1:0;
        System.out.println(c);
    }
}

