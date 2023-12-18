
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String b = sc.next();
        int i,j;
        int k = 0;

        String[] po =new String[a];

        for(i=0;i<a;i++)
            po[i]=b.substring(i,i+1);

        for(j=0;j+1<a;j++)
            if(po[j].equals(".")){
                if(po[j+1].equals("#")){
                    k++;
                    po[j+1] = ".";
                }

        }

        System.out.println(k);

    }
}