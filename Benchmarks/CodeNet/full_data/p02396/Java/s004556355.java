
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int i = 1;
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                break;
            }
            System.out.printf("Case "+ i +": "+ num);
        }
    }
}

