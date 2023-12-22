import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long num = 0;
        int count=0;
        while (num<n){
            count++;
            num+=(long)Math.pow(26,count);
        }
        long instance = n-num+(long)Math.pow(26,count)-1;
        ArrayList<Character> array = new ArrayList<>();
        for (int i=0;i<count;i++){
            int mod = (int) (instance%26);
            array.add((char)mod);
            instance /= 26;
        }
        String s = "";
        for (int i=0;i<array.size();i++){
            s = (char) (array.get(i) + 'a') +s;
        }
        System.out.println(s);
    }
}
