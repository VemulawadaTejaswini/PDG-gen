import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer x = Integer.parseInt(scanner.next());

        Integer[] a = new Integer[x];
        for(int i=0; i < x; i++) {
            a[i] = Integer.parseInt(scanner.next());
        }

        String answer = new String();
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a.length; j++) {
                if(a[j] == i+1) {
                    answer += String.valueOf(j+1) + " ";
                }
            }
        }

       System.out.println(answer.trim());
    }
}