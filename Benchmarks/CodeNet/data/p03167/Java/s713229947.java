import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
import java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int r = in.nextInt();
        int c = in.nextInt();
        int mod = 1000000007;
        String [] paht = new String[r];
        for(int i=0;i<r;i++)
            paht[i]= in.next();
        int [][]mark = new int[r][c];
        mark[0][0]=1;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i!=0 || j!=0){
                    if (paht[i].charAt(j)!='#'){
                        int v = 0;
                        if(i>0)
                            v= mark[i-1][j];
                        if(j>0)
                            v+=mark[i][j-1];
                        mark[i][j]= v%mod;
                    }
                }

            }
        }
        System.out.println(mark[r-1][c-1]);

    }


}
