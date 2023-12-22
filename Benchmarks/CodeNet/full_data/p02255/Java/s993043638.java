
import java.util.Scanner;

/**
 * Created by ??\??? on 2016/12/2.
 */
public class Main {
    static void print(Object[] array)
    {
        for(int i = 0;i<array.length;i++)
        {
            if(i==0)
                System.out.print(array[i].toString());
            else
                System.out.print(" "+array[i].toString());
        }
        System.out.println();
    }
    static int run(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int T = Integer.parseInt(scan.nextLine());
            String[] array = scan.nextLine().split(" ");
            for (int i = 1; i <= T; i++) {
                if (i == 1)
                    print(array);
                else {
                    int pointer = i - 1;
                    for (int j = pointer - 1; j >= 0; j--) {
                        if (Integer.parseInt(array[pointer]) < Integer.parseInt(array[j])) {
                            String temp = array[pointer];
                            array[pointer] = array[j];
                            array[j] = temp;
                            pointer = j;
                        } else break;
                    }
                    print(array);
                }
            }
        }
        return 0;
    }
    public static void main(String[] args)
    {
        run(args);
    }

}