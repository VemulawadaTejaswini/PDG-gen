import java.io.*;
  
class Main{
    public static void main(String[] args) throws Exception{
        
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        while((str = br.readLine()) != null){
            i++;
            if (str.equals("0")) {
                return;
            }
            System.out.println("Case " + i + ": " + str);
        }
    }
}