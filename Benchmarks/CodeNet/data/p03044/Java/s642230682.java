import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(stdR.readLine());
        int[] painted = new int[N];//0 undef 1 white 2 black
        Queue<String> q = new LinkedList<String>();
        for(int i = 0 ; i < N - 1 ; i++) {
            q.add(stdR.readLine());
        }
        int count = 0;
        int tmpu = -1;
        int tmpv = -1;
        while(!q.isEmpty()) {
            String[] strs = q.poll().split(" ");
            int u = Integer.parseInt(strs[0]);
            int v = Integer.parseInt(strs[1]);
            int w = Integer.parseInt(strs[2]);
            if(count == 0) {
                if(w % 2 != 0) {
                    painted[u - 1] = 1;
                    painted[v - 1] = 2;
                }else {
                    painted[u - 1] = 1;
                    painted[v - 1] = 1;
                }
                tmpu = u;
                tmpv = v;
                count++;
            }else {
                if(u == tmpu || u == tmpv) {
                    if(w % 2 != 0) {
                        if(painted[u - 1] == 1) {
                            painted[v - 1] = 2;
                        }else {
                            painted[v - 1] = 1;
                        }
                    }else {
                        if(painted[u - 1] == 1) {
                            painted[v - 1] = 1;
                        }else {
                            painted[v - 1] = 2;
                        }
                    }
                    tmpu = u;
                    tmpv = v;
                    count++;
                }else if(v == tmpu || v == tmpv) {
                    if(w % 2 != 0) {
                        if(painted[v - 1] == 1) {
                            painted[u - 1] = 2;
                        }else {
                            painted[u - 1] = 1;
                        }
                    }else {
                        if(painted[v - 1] == 1) {
                            painted[u - 1] = 1;
                        }else {
                            painted[u - 1] = 2;
                        }
                    }
                    tmpu = u;
                    tmpv = v;
                    count++;
                }else {
                    q.add(u+" "+v+" "+w);
                }
            }
        }

        for(int i = 0 ; i < N ; i++) {
            System.out.println(painted[i] - 1);
        }
    }
}
