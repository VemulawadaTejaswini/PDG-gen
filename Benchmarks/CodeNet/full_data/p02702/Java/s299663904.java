import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long count = 0;
        String s = scan.next();
        for(int i = 0; i < s.length(); i++){
            for(int j = i+4; j < s.length()+1; j++){
                String subString = s.substring(i, j);
                long num = Long.valueOf(subString);
                if(num%2019 == 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}