import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
        int sets=Integer.parseInt(bfr.readLine());
        for(int i=0; i<sets; i++) {
        	String now=bfr.readLine();
            char ans[]=now.toCharArray();
            for(int j=0;j<now.length()-6;j++){
                if(now.substring(i,i+7).equals("Hoshino")){
                    ans[i]='H';
                    ans[i+1]='o';
                    ans[i+2]='s';
                    ans[i+3]='h';
                    ans[i+4]='i';
                    ans[i+5]='n';
                    ans[i+6]='a';
                }
            }
            System.out.println(new String(ans));
        }
    }
}
