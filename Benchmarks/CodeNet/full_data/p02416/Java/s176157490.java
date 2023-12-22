import java.io.*;

class Main{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        int sum;
        char c;
        while(true){
            String line = br.readLine();
            if(line.length() == 1 && line.charAt(0) == '0'){ break; }
            sum = 0;
            for(int i = 0; i < line.length(); i++){
                c = line.charAt(i);
                sum += (c - 48);
            }
            System.out.println(sum);
        }
    }
}
