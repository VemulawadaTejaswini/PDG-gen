import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[]c=sc.next().toCharArray();
        for(int i=0;i<c.length;i++)System.out.print((char)((c[i]-'A'+n)%26+'A'));
    }
}
