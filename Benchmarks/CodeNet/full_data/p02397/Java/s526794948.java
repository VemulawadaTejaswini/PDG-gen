import java.io.*;

public class test {
    
    public static void main(String[] args) throws IOException{
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in),1);
        int x = 0;
        while(x<3001){
            String st = br.readLine();
            String[] num = st.split(" ",0);
            int a = Integer.parseInt(num[0]);
            int b = Integer.parseInt(num[1]);
            if(a > b)
            {
                int c = a;
                a = b;
                b = c;
            }
            if(0<=a && a<10001 && 0<=b && b<10001)
            {
                sb.append(a);
                sb.append(b);
                x++;
                String str = sb.toString();
                System.out.println(str);
            }
        }
    }
}