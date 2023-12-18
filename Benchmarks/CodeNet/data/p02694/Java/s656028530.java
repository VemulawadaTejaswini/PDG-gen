    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            double x = Double.parseDouble(br.readLine());

            double years = Math.round(Math.log(x/100)/(Math.log(1.01)));
            int y = (int)years;

            System.out.println(y);
        }
    }

