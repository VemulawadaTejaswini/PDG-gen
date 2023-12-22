import java.io.*;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        try {
            str = br.readLine();
            String[] num = str.split(" ", 0);
            int n = Integer.parseInt(num[0]);
            int[] a = new int[n];
            int q = Integer.parseInt(num[1]);
            if (0 < n && n < 1000001 && 0 < q && q < 100001) {
                int i = 0;
                int ra = 0;
                for(int j=0;j<n;j++){
                    a[j]=0;
                }
                do {
                    str = br.readLine();
                    String[] s = str.split(" ", 0);
                    int A = Integer.parseInt(s[0]);
                    int v = Integer.parseInt(s[1]);
                    a[A-1] += v;
                    int max = 0;
                    for(int j=0;j<n;j++){
                        if(max<a[j]){
                            max = a[j];
                            ra = j+1;
                        }
                    }
                    System.out.println(ra+ " " + max);
                    i++;
                } while (i < q);
            }
        } catch (IOException ex) {
        }catch (NumberFormatException ex){
        }

    }
}