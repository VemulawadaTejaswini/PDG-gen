import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = 0;
        for(;i <= j;i++){
            String[] s = String.valueOf(i).split("");
            if(s[0].equalsIgnoreCase(s[4])&&s[1].equalsIgnoreCase(s[3])) k++;
        }
        System.out.println(k);
    }
}