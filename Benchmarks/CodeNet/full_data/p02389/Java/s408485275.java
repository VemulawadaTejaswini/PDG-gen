import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
    {
        public static void main (String[] args)
            {
                Scanner scanner = new Scanner(System.in);

                try
                    {
                        int inputA = scanner.nextInt();
                        int inputB = scanner.nextInt();

                        // 面積を求める
                        int area = inputA * inputB;

                        // 周の長さを求める
                        int length = (inputA + inputB) * 2;

                        System.out.println(area + " " + length);
                    }
                catch (InputMismatchException e)
                    {
                        System.out.println("整数を入力してください");
                        e.printStackTrace();
                    }
            }
    }