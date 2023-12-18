import java.util.*;

public class Main{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

		String s = sc.next();
		long k = sc.nextLong();

        long count = 1;
        long in = 0;
        long head = 0;
        long tail = 0;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i - 1)) count++;
            else{
                if(head == 0) head = count;
                else in += count / 2;
                count = 1;
            }
        }
        if(head == 0) head = count;
        else tail = count;

        if(s.charAt(0) == s.charAt(s.length() - 1)) System.out.println(in * k + (head + tail) / 2 * (k - 1) + head / 2 + tail / 2);
        else System.out.println(in * k + head / 2 + tail / 2);

    }

}
