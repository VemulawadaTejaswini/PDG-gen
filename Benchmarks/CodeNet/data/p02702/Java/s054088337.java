import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        for(int i=0 ; i < s.length() -3 ; i ++){
            for (int j = i + 3; j < s.length(); j ++){
                int num = Integer.parseInt(s.substring(i,j));
                if (num % 2019 == 0){
                    ans ++;
                }

            }
        }
        System.out.println(ans);
    }
}