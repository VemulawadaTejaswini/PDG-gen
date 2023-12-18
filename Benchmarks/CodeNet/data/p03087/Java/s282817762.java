import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));      
        String line = stdin.readLine();
        //int s_len = Character.getNumericValue(line.charAt(0));
        int n = Character.getNumericValue(line.charAt(2));
        //System.out.println(s_len);

        String s = stdin.readLine();

        for(int i=0;i<n;i++){
            line = stdin.readLine();
            int l = Character.getNumericValue(line.charAt(0));
            int r = Character.getNumericValue(line.charAt(2));
            String str = s.substring(l-1,r);
            //System.out.println(str);
            String ac = "AC";
            int result=0;
            int count=0;
            while(result!=-1){
                result = str.indexOf(ac);
                if(result!=-1){
                    count+=1;
                    str = str.substring(result+2);
                }
            }
            System.out.println(count);
        }
    }
}
