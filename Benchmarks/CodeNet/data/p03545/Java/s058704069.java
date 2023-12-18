import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int[][] op = new int[][]{{1,1,1},{1,1,-1},{1,-1,1},{-1,1,1},{-1,-1,1},{-1,1,-1},{1,-1,-1},{-1,-1,-1}};
        int[] a = new int[4];
        for(int i=0;i<4;i++){
            a[i] = S.charAt(i)-'0';
        }
        String[] dic = new String[]{"-"," ","+"};
        for(int i=0;i<8;i++){
            int[] cur = op[i];
            int res = a[0]+a[1]*cur[0]+a[2]*cur[1]+a[3]*cur[2];
            if(res == 7){
                StringBuilder sb = new StringBuilder();
                sb.append(a[0]);
                sb.append(dic[cur[0]+1]);
                sb.append(a[1]);
                sb.append(dic[cur[1]+1]);
                sb.append(a[2]);
                sb.append(dic[cur[2]+1]);
                sb.append(a[3]);
                sb.append("=7");
                System.out.println(sb.toString());
                System.exit(0);
            }
        }
    }
}
