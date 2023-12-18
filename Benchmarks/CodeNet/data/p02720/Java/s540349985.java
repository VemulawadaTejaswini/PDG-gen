import java.util.Scanner;
public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int k = 1;
        int j = 1;
        while (i < n - 1){

            if (isLunlun(j)){

                k = j;
                i++;
            }
            j++;
        }
        System.out.print(k);
    }
    public static boolean isLunlun(int n){

        if (n <= 10)
            return true;
        else{

            String s = Integer.toString(n);
            for (int i = 0;i < s.length() - 1;i ++){

                int a = Integer.parseInt(s.substring(i, i + 1));
                int b = Integer.parseInt(s.substring(i + 1, i + 2));
                if (Math.abs(a - b) != 1)
                    return false;
            }
            return true;
        }
    }
}