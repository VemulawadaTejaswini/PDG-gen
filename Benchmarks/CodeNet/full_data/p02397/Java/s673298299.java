import java.io.*;
 
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        while(true) {
            String str = br.readLine();
            if(str.equals("0 0")) break;
            int x = Integer.parseInt(str.substring(0, str.indexOf(' ')));
            int y = Integer.parseInt(str.substring(str.indexOf(' ')+1));
            if(x<=y) output.append(x+" "+y+"\n");
            else output.append(y+" "+x+"\n");
        }
        System.out.print(output);
    }
 
}