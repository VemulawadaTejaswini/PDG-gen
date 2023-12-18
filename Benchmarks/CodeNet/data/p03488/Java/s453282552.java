import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int N = s.length();
        int x = sc.nextInt();
        int y = sc.nextInt();
        ArrayList<Integer> x_axis = new ArrayList<Integer>();
        ArrayList<Integer> y_axis = new ArrayList<Integer>();
        int cnt = 0;
        int flag = 1;
        for (int i=0;i<N;i++) {
            if (s.charAt(i)=='F') {
                cnt++;
                if (i==N-1) {
                    if (flag==1) {
                        x_axis.add(cnt);
                    } else { // flag==-1
                        y_axis.add(cnt);
                    }
                }
            } else { // s.charAt(i)=='T'
                if (cnt!=0) {
                    if (flag==1) {
                        x_axis.add(cnt);
                    } else { // flag==-1
                        y_axis.add(cnt);
                    }
                }
                flag*=(-1);
                cnt=0;
            }
        }
        int x_size = x_axis.size();
        int y_size = y_axis.size();
        int[][] dp_x = new int[20000][x_size+1];
        int[][] dp_y = new int[20000][y_size+1];
        dp_x[10000][0]=1;
        for (int i=1;i<=x_size;i++) {
            for (int j=0;j<20000;j++) {
                if (dp_x[j][i-1]==1) {
                    dp_x[j+x_axis.get(i-1)][i]=1;
                    if (i!=1) {
                        dp_x[j-x_axis.get(i-1)][i]=1;
                    }
                }
            }
        }
        dp_y[10000][0]=1;
        for (int i=1;i<=y_size;i++) {
            for (int j=0;j<20000;j++) {
                if (dp_y[j][i-1]==1) {
                    dp_y[j+y_axis.get(i-1)][i]=1;
                    dp_y[j-y_axis.get(i-1)][i]=1;
                }
            }
        }
        if (dp_x[x+10000][x_size]==1 && dp_y[y+10000][y_size]==1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        // System.out.println("x_axis: " + x_axis);
        // System.out.println("y_axis: " + y_axis);
    }
}