import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String str = br.readLine();
            if(str.equals("0")){
                break;
            }
            int len = str.length();
            int Sum = 0;
            for(int i=1;i<=len;i++){
                Sum = Sum + str.charAt(i-1) - '0';
            }
        System.out.printf("%d\n",Sum);
        }
    }
}
