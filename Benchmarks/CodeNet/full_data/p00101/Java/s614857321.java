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
                    ans[j]='H';
                    ans[j+1]='o';
                    ans[j+2]='s';
                    ans[j+3]='h';
                    ans[j+4]='i';
                    ans[j+5]='n';
                    ans[j+6]='a';
                }
            }
            System.out.println(new String(ans));
        }
    }
}
