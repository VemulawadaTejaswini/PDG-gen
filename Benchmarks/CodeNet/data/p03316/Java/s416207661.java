import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = Integer.parseInt(str);
        int a = 0;
        char[] ch = str.toCharArray();
        for(int i = 0; i < str.length(); i++){
            a = Character.getNumericValue(ch[i]);
            a++;
        }
        if(num % a == 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}