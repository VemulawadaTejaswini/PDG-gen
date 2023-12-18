import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long N = Long.parseLong(scan.next());
        int count = 2;
        
        for(int i=2; i<=N/2; i++)
        {
            Long tmp = N;
            while(tmp-i>0)
            {
                if(tmp%i==0) tmp=tmp/i;
                else tmp=tmp-i;
            }
            
            //System.out.println("i:" + i + "=" + tmp);

            if(tmp==1)
            {
                count++;
            }
        }
        
        System.out.println(count);
        scan.close();
    }
}