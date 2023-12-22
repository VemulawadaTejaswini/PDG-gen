import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("xの値を入力してください。");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = reader.readLine();
            int x = Integer.parseInt(str);
            System.out.println("xの3乗は" + x * x * x);
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("xが正しくありません。");
        }
    }
}

