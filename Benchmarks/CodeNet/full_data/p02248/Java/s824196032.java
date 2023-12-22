import java.io.*;
public class Main {
    public static void main(String[] args) {    
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        PrintWriter out = new PrintWriter(System.out);
        try{
            String text = reader.readLine();
            String pattern = reader.readLine();
            
            int txtCsl = 1;
            int ptnCsl = 0;
            
            int[] skip = new int[pattern.length() + 2];
            
            skip[txtCsl] = 0;
            
            //????´¢????±??????????????????????+1?????§
            while (txtCsl != pattern.length() + 1) {
                //??????????????????????????????????????????
                if (txtCsl != pattern.length() && pattern.charAt(txtCsl) == pattern.charAt(ptnCsl)) {
                    skip[++txtCsl] = ++ptnCsl;
                } else if (ptnCsl == 0) {
                    skip[++txtCsl] = ptnCsl;
                } else {
                    ptnCsl = skip[ptnCsl];
                }
            }
            
            txtCsl = ptnCsl = 0;
            while (txtCsl != text.length() && ptnCsl != pattern.length()) {
                if (text.charAt(txtCsl) == pattern.charAt(ptnCsl)) {
                    txtCsl++;
                    ptnCsl++;
                    if (ptnCsl == pattern.length()) {
                    	System.out.println(txtCsl - ptnCsl);
                    	ptnCsl = skip[ptnCsl];
                    }
                } else if (ptnCsl == 0) {
                    txtCsl++;
                } else {
                    ptnCsl = skip[ptnCsl];
                }
            }
        
        
        }catch(IOException e){
            System.out.println(e);
        }
        out.flush();
    }
}