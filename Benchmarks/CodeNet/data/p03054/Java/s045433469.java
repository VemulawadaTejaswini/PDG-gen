import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int[] start = new int[2];
        start[0] = sc.nextInt();
        start[1] = sc.nextInt();
        String s = sc.next();
        String t = sc.next();

        int[][] max = new int[n][4];
        int[] cur = new int[4];
        switch(s.charAt(n-1)){
            case 'L':
            max[n-1][0] = 1;
            cur[0] = 1;
            break;
            case 'R':
            max[n-1][1] = 1;
            cur[1] = 1;
            break;
            case 'U':
            max[n-1][2] = 1;
            cur[2] = 1;
            break;
            case 'D':
            max[n-1][3] = 1;
            cur[3] = 1;
            break;
        }
        for(int i=n-2; i>=0; i--){
            switch(t.charAt(i)){
                case 'L':
                cur[1] = Math.max(0, cur[1] - 1);
                break;
                case 'R':
                cur[0] = Math.max(0, cur[0] - 1);
                break;
                case 'U':
                cur[3] = Math.max(0, cur[3] - 1);
                break;
                case 'D':
                cur[2] = Math.max(0, cur[2] - 1);
                break;
            }
            for(int j=0; j<4; j++) max[i][j] = cur[j];
            switch(s.charAt(i)){
                case 'L':
                max[i][0]++;
                cur[0]++;
                break;
                case 'R':
                max[i][1]++;
                cur[1]++;
                break;
                case 'U':
                max[i][2]++;
                cur[2]++;
                break;
                case 'D':
                max[i][2]++;
                cur[2]++;
                break;
            }
        }

        int hmin = start[0];
        int hmax = start[0];
        int wmin = start[1];
        int wmax = start[1];
        for(int i=0; i<n; i++){
            hmin = Math.max(hmin, max[i][2]+1);
            hmax = Math.min(hmax, h - max[i][3]);
            wmin = Math.max(wmin, max[i][0]+1);
            wmax = Math.min(wmax, w - max[i][1]);
            if(hmin > hmax || wmin > wmax){
                System.out.println("NO");
                return;
            }
            // switch(s.charAt(i)){
            //     case 'L':
            //     wmin--;
            //     break;
            //     case 'R':
            //     wmax++;
            //     break;
            //     case 'U':
            //     hmin--;
            //     break;
            //     case 'D':
            //     hmax++;
            //     break;
            // }

            switch(s.charAt(i)){
                case 'L':
                wmax--;
                if(wmin > wmax) wmin = wmax;
                break;
                case 'R':
                wmin++;
                if(wmax < wmin) wmax = wmin;
                break;
                case 'U':
                hmax--;
                if(hmin > hmax) hmin = hmax;
                break;
                case 'D':
                hmin++;
                if(hmax < hmin) hmax = hmin;
                break;
            }

            switch(t.charAt(i)){
                case 'L':
                wmin--;
                break;
                case 'R':
                wmax++;
                break;
                case 'U':
                hmin--;
                break;
                case 'D':
                hmax++;
                break;
            }
        }

        System.out.println("YES");
    }
}