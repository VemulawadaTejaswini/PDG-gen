import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            String line = br.readLine();
            int[] a = new int[line.length()];
            long sum = 0;

            for(int i = 0; i < line.length(); i++){
                a[i] = Integer.parseInt(line.substring(i, i+1));
            }

            if(Integer.parseInt(line) == 0){
                break;
            }else{
                for(int i = 0; i < line.length(); i++){
                    sum += a[i];
                }
                sb.append(sum).append("\n");
            }
        }
        System.out.print(sb.toString());
    }
}