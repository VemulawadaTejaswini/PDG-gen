import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s[] = new String[n];
        int mCount = 0;
        int aCount = 0;
        int rCount = 0;
        int cCount = 0;
        int hCount = 0;
        for(int i=0;i<n;i++){
            s[i] = scanner.next();
            switch(s[i].charAt(0)){
                case 'M':
                    mCount++;
                    break;
                case 'A':
                    aCount++;
                    break;
                case 'R':
                    rCount++;
                    break;
                case 'C':
                    cCount++;
                    break;
                case 'H':
                    hCount++;
                    break;
            }
        }
        int[] d = {mCount,aCount,rCount,cCount,hCount};
        int[] x = {0,0,0,0,0,0,1,1,1,2};
        int[] y = {1,1,1,2,2,3,2,2,3,3};
        int[] z = {2,3,4,3,4,4,3,4,4,4};
        int allCount = 0;
        for(int i=0;i<10;i++){
            allCount += d[x[i]] * d[y[i]] * d[z[i]];
        }
        System.out.println(allCount);
    }

}
