import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String S_[] = new String[S.length()];
        for (int i=0;i<S.length();i++){
            S_[i] = String.valueOf(S.charAt(i));
        }
        String cmp = "1";
        int zero = 0;
        int one = 0;
        for (int i=0;i<S.length();i++){
            if (S_[i].equals(cmp)){
                zero++;
            }
            if (cmp.equals("1")){
                cmp = "0";
            } else {
                cmp = "1";
            }
        }
        cmp = "0";
        for (int i=0;i<S.length();i++){
            if (S_[i].equals(cmp)){
                one++;
            }
            if (cmp.equals("1")){
                cmp = "0";
            } else {
                cmp = "1";
            }
        }
        System.out.println(Math.min(zero,one));
    }
}