import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class payment {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int  n = Integer.parseInt(br.readLine());
        if(n%1000==0)
            System.out.println(0);
        else
            System.out.println(1000 - (n%1000));
    }
}
