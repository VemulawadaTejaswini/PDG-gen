import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return (Integer.parseInt(next()));
        }

        long nextLong() {
            return (Long.parseLong(next()));
        }

        String nextLine() {
            String s = "";
            try {
                s = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return s;
        }
    }
    static String CS="";
    public static void main(String[] args) {
         FastReader in = new FastReader();
         String s1= in.nextLine();
         String s2=in.nextLine();
         String res[][]=new String[s1.length()+1][s2.length()+1];
         for(int i=0;i<=s1.length();i++){
             for(int j=0;j<=s2.length();j++){
                 res[i][j]="";
             }
         }
         for(int i=1;i<=s1.length();i++) {
             char a = s1.charAt(i-1);
             for (int j = i; j <= s2.length(); j++) {
                 if(a==s2.charAt(j-1)){
                     res[i][j]=res[i-1][j]+a;
                 }else{
                     res[i][j]=max(res[i-1][j],res[i][j-1]);
                 }
             }
         }
         System.out.println(res[s1.length()][s2.length()]);
    }
    static String max(String s1,String s2){
        if(s1.length()>=s2.length()){
            return s1;
        }else{
            return s2;
        }
    }

}
