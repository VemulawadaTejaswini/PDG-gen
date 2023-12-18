import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[] p = new int[n];
        int[] clonep = new int[n];
        for(int i = 0;i<p.length;i++) {
            p[i] = stdIn.nextInt();
            clonep[i] = p[i];
        }
        Arrays.sort(clonep);
        for(int i = 0;i<p.length;i++) {
            for(int j = i;j<p.length;j++) {
                int tmp = p[i];
                p[i] = p[j];
                p[j] = tmp;
                int count = 0;
                for(int k = 0;k<p.length;k++) {
                    if(p[k]==clonep[k]) count++;
                }
                if(count==p.length) {
                    System.out.println("YES");
                    System.exit(0);
                }
                tmp = p[i];
                p[i] = p[j];
                p[j] = tmp;
            }
        }
        System.out.println("NO");
    }
}