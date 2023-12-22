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
                        int inputC = scanner.nextInt();

                        if (inputA < inputB && inputB < inputC)
                            {
                                System.out.println("Yes");
                            }
                        else
                            {
                                System.out.println("No");
                            }
                    }
                catch (InputMismatchException e)
                    {
                        System.out.println("整数を入力してください");
                        e.printStackTrace();
                    }
            }
    }