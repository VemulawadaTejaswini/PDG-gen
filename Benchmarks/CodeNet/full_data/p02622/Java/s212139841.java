import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String  s = scanner.nextLine();
        String t = scanner.nextLine();

        char[] s_a = s.toCharArray();
        char[] t_a = t.toCharArray();

        int count = 0;

        for(int i = 0; i <= s_a.length -1; i++ ){
            if(!(s_a[i] == t_a[i])){
                count +=1;
            }
        }
        System.out.println(count);
    }
}
