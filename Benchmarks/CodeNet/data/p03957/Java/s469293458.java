import java.io.*;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = br.readLine();
            int l = str.length();
            if (1 < l && l < 101) {
                int c = 0;
                int f = 0;
                for (int i = 0; i < l; i++) {
                    if (str.charAt(i) == 'C'&&c==0) {
                        c++;
                    }
                    if(str.charAt(i)=='F'&&c==1){
                        f++;
                        break;
                    }
                }
                if(f==1){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        } catch (IOException ex) {
        }
    }
}