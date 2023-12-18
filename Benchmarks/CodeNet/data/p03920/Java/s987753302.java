import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b[] = new int[a];
        int c = a / 2 + 1;
        int count = 0;
        a -= c;
        b[count] = c;
        ++count;
        --c;
        while (true){
            if(a >= c){
                a -= c;
                b[count] = c;
                ++count;
                --c;
            }
            else if(a == 0){
                break;
            }
            else{
                --c;
            }

        }
        String s = "";
        for (int k = 0;k < count;++k){
            s += b[count - k - 1] + " ";
        }
        System.out.println(s);
    }
}
