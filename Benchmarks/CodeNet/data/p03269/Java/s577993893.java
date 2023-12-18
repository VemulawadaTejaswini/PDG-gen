import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        sc.close();

        String s = Integer.toBinaryString(l);
        int num1 = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1') num1++;
        }
        System.out.println((s.length()) + " " + ((s.length()-1)*2+num1-1));
        for(int i=0; i<s.length()-1; i++){
            System.out.println((i+1) + " " + (i+2) + " 0");
            System.out.println((i+1) + " " + (i+2) + " " + (int)(Math.pow(2, i)));
        }
        int tmp = (int)(Math.pow(2, s.length()-1));
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                System.out.println((s.length()-i) + " " + (s.length()) + " " + tmp);
                tmp += (int)(Math.pow(2, s.length()-i-1));
            }
        }
    }
}