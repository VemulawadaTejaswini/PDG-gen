import java.io.*;

public class Main {

    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String st = br.readLine();
            String[] s = st.split(" ", 0);
            int k = Integer.parseInt(s[0]);
            int maxk = k/2;
            int t = Integer.parseInt(s[1]);
            st = br.readLine();
            s = st.split(" ", 0);
            int maxa = 0;
            for(int i = 0; i < t;i++){
                int a = Integer.parseInt(s[i]);
                if(maxa<a){
                    maxa = a;
                }
            }
            int x = maxa - maxk;
            if(x<=0){
                System.out.println("0");
            }else{
                System.out.println(1+(x-1)*2);
            }
        }catch(IOException ex){
        }
    }
}