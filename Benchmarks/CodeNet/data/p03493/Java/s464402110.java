import java.util.Scanner;

/*
 * ABC081A - Placing Marbles
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] in = sc.next().toCharArray();
        int count = 0;
        for(char c :in){
            if(c == '1'){
                count++;
            }
        }
        System.out.println(count);
        sc.close();

    }

}
