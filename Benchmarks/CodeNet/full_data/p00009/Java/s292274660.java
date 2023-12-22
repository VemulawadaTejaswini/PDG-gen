import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {

            String s;
            boolean isPrime = true;
            int count = 0;

            while ((s = br.readLine()) != null) {

                if (Integer.parseInt(s) >= 2) {

                    count = 1;

                }

                for (int i = 3; i <= Integer.parseInt(s); i++) {

                    for (int j = 2; j < i; j++) {

                        if (i % j == 0) {
                            isPrime = false;
                        }

                    }

                    if (isPrime) {
                        count++;
                    } else {
                        isPrime = true;
                    }

                }
                System.out.println(count);
                count = 0;

            }

        } finally {
            br.close();
        }

    }
}