import java.io.*;
import java.util.Arrays;
public class Main {
        public static void main(String[] args) throws IOException {
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                String is;
                String ia[];
                while(true){
                        int a = Integer.parseInt(in.readLine());
                        if(a == 0){
                                break;
                        }
                        int b[][] = new int[a][];
                        for(int i = 0;i < a; ++i){
                                is = in.readLine();
                                ia = is.split(" ");
                                b[i] = new int[a];
                                for(int j = 0;j < a; ++j){
                                        b[i][j] = Integer.parseInt(ia[j]);
                                }
                        }
                        boolean c[][] = new boolean[a][];
                        for(int i = 0;i < a; ++i){
                                c[i] = new boolean[a];
                                Arrays.fill(c[i],false);
                        }

                        for(int i = 0;i < a; ++i){
                                int t = 0;
                                for(int j = 0;j < a; ++j){
                                        if(b[i][j] < b[i][t]){
                                                t = j;
                                        }
                                }
                                for(int j = 0;j < a; ++j){
                                        if(b[i][j] == b[i][t]){
                                                c[i][j] = true;
                                        }
                                }
                        }
                        boolean d[][] = new boolean[a][];
                        for(int i = 0;i < a; ++i){
                                d[i] = new boolean[a];
                                Arrays.fill(d[i],false);
                        }
                        for(int i = 0;i < a; ++i){
                                int t = 0;
                                for(int j = 0;j < a; ++j){
                                        if(b[j][i] > b[t][i]){
                                                t = j;
                                        }
                                }
                                for(int j = 0;j < a; ++j){
                                        if(b[j][i] == b[t][i]){
                                                d[j][i] = true;
                                        }
                                }
                        }

                        boolean e = false;
                        for(int i = 0;i < a; ++i){
                                for(int j = 0;j < a; ++j){
                                        if(!e && c[i][j] == true && d[i][j] == true){
                                                System.out.println(b[i][j]);
                                                e = true;
                                                break;
                                        }
                                }
                                if(e){
                                        break;
                                }
                        }
                        if(!e){
                                System.out.println(0);
                        }
                }
        }
}