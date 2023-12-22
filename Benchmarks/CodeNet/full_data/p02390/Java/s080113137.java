import java.io.*;
 
class Spread {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        String line = br.readLine();
        int r = Integer.parseInt(line.substring(0, line.indexOf(' ')));
        int c = Integer.parseInt(line.substring(line.indexOf(' ')+1));
		System.out.println( "r=" + r + " c=" + c ) ;
        int[] s = new int[c+1];
        for(int i=0; i<r; i++) {
            line = br.readLine();
            output.append(line).append(' ');
            String[] inputs = line.split(" ");
            int sum=0;
            for(int j=0; j<c; j++) {
                int num = Integer.parseInt(inputs[j]);
                s[j]+= num;
                sum += num;
            }
            s[c] += sum;
            output.append(sum).append('\n');
        }
        for(int i=0; i<c; i++) {
            output.append(s[i]).append(' ');
        }
        output.append(s[c]).append('\n');
        System.out.print(output);
    }
}