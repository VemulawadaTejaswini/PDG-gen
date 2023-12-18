import java.io.*;
import java.util.*;

public class Main
{
    PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer tok;

    public void go() throws IOException
    {
        ntok();
        int n = ipar();
        ntok();
        char[] s = spar().toCharArray();
        int[] rPre = new int[n+1];
        int[] gPre = new int[n+1];
        int[] bPre = new int[n+1];
        for (int i = 0; i < n; i++) {
            rPre[i+1] = rPre[i];
            gPre[i+1] = gPre[i];
            bPre[i+1] = bPre[i];
            if (s[i] == 'R') {
                rPre[i+1]++;
            } else if (s[i] == 'G') {
                gPre[i+1]++;
            } else {
                bPre[i+1]++;
            }
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (s[i] != s[j]) {
                    if (s[i] == 'R' && s[j] == 'G' || s[i] == 'G' && s[j] == 'R') {
                        sum += bPre[n] - bPre[j+1];
                        if (j + j-i < n && s[j + j-i] == 'B') {
                            sum--;
                        }
                    }
                    if (s[i] == 'R' && s[j] == 'B' || s[i] == 'B' && s[j] == 'R') {
                        sum += gPre[n] - gPre[j+1];
                        if (j + j-i < n && s[j + j-i] == 'G') {
                            sum--;
                        }
                    }
                    if (s[i] == 'B' && s[j] == 'G' || s[i] == 'G' && s[j] == 'B') {
                        sum += rPre[n] - rPre[j+1];
                        if (j + j-i < n && s[j + j-i] == 'R') {
                            sum--;
                        }
                    }
                }
            }
        }
        out.println(sum);

        out.flush();
        in.close();
    }

    public void ntok() throws IOException
    {
        tok = new StringTokenizer(in.readLine());
    }

    public int ipar()
    {
        return Integer.parseInt(tok.nextToken());
    }

    public int[] iapar(int n)
    {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = ipar();
        }
        return arr;
    }

    public long lpar()
    {
        return Long.parseLong(tok.nextToken());
    }

    public long[] lapar(int n)
    {
        long[] arr = new long[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = lpar();
        }
        return arr;
    }

    public double dpar()
    {
        return Double.parseDouble(tok.nextToken());
    }

    public String spar()
    {
        return tok.nextToken();
    }

    public static void main(String[] args) throws IOException
    {
        new Main().go();
    }
}
