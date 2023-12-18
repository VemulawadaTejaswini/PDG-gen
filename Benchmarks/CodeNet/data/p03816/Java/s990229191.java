import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        final int  MX = (int)(1e5);
        int[] card = new int[MX+1];
        int remove = 0;
        int mem = 0;
        for(int i = 0;i<n;i++){
            card[in.nextInt()]++;
        }
        int ans = 0;
        for(int i = 1;i<=MX;i++){
            if (card[i]>=2){
                if(card[i]%2==0){
                    card[i]=2;
                }
                else {
                    card[i]=1;
                }

            }
            if(card[i]==2){
                if(remove==0){
                    remove=2;
                    mem=i;
                }
                else
                {
                    card[mem]=1;
                    card[i]=1;
                    remove=0;
                    ans--;
                }
            }
            ans+=card[i];
        }
        if(remove>0){
            ans-=2;
        }
        System.out.println(ans);
    }
}
