import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] x = new Integer[n];
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
        }

        Arrays.sort(x,Collections.reverseOrder());

        int s=0;
        s=s+x[0];
        if(n>0) {
            for (int i=1;i<n-1;i++) {
                s=s+x[((i+1)/2)];
                System.out.println(i+",s="+s);
            }
        }

        System.out.println(s);
    }
}

