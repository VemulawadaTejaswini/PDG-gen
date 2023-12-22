import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        boolean[][] map=new boolean[8][8];
        int c=1;
        while (n-->0) {
            for(int i=0;i<8;i++) {
                char[] s=sc.next().toCharArray();
                for(int j=0;j<8;j++) {
                    map[i][j]=s[j]=='1';
                }
            }
            Deque<int[]> stack=new ArrayDeque<>();
            stack.push(new int[] {sc.nextInt()-1,sc.nextInt()-1});
            int[] mx= {0,0,1,-1};
            int[] my= {1,-1,0,0};
            while(!stack.isEmpty()) {
                int[] p=stack.pop();
                map[p[1]][p[0]]=false;
                for(int i=0;i<4;i++) {
                    for(int j=1;j<=3;j++) {
                        int dx=p[0]+mx[i]*j;
                        int dy=p[1]+my[i]*j;
                        if(dx>=0&&dx<8&&dy>=0&&dy<8&&map[dy][dx]) {
                            map[dy][dx]=false;
                            stack.push(new int[] {dx,dy});
                        }
                    }
                }
            }
            System.out.println("Data "+c+++":");
            for(int i=0;i<8;i++) {
                for(int j=0;j<8;j++) {
                    System.out.print(map[i][j]?"1":"0");
                }
                System.out.println();
            }
        }
    }
}
