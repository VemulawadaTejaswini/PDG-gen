import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String st = br.readLine();
            String[] s = st.split(" ", 0);
            int N = Integer.parseInt(s[0]);
            int A = Integer.parseInt(s[1]);
            int B = Integer.parseInt(s[2]);
            int j = 0;
            for(int i = 0; i < N; i++){
                Scanner sc = new Scanner(System.in);
                int x = sc.nextInt();
                if(x<A||B-1<x) j++;
            }
            System.out.println(j);
        } catch (IOException ex) {
        }
    }
}