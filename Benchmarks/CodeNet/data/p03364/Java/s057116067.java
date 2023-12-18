import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
                int n = Integer.parseInt(line);
                String[] s = new String[n];
                for(int i=0; i<n; i++){
                    s[i] = br.readLine();
                }
                int r = 0;
                for(int a=0; a<n; a++){
                    boolean flag = true;
                    String[] sa = new String[n];
                    for(int i=0; i<n; i++){
                        sa[i] = s[i].substring(a,n)+s[i].substring(0,a);
                    }
                    sq:for(int i=0; i<n; i++){
                        //int k = (i+a)%n;
                        for(int j=i+1; j<n; j++){
                            if(sa[i].charAt(j) != sa[j].charAt(i)){//(s[k].charAt(j) != s[j].charAt(k)){
                                flag = false;
                                break sq;
                            }
                        }
                    }
                    if(flag) r++;
                }
                System.out.println(r*n);
            }
        }
    }
}