import java.io.*;

    class Main {
        public static void main(String[] args){
            try {

            BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
            String str[] = (br.readLine()).split("\\s+");
            int A = Integer.parseInt(str[0]);
            int P = Integer.parseInt(str[1]);

            P += 3*A;
            System.out.println(P/2);

            } catch(IOException e) {
                System.out.println("Exception :" + e);
            }

        }
    }
