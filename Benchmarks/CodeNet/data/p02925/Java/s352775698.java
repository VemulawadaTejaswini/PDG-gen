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
        LinkedList<Integer>[] matches = new LinkedList[n+1];
        for(int i=0;i<=n;i++){
            matches[i] = new LinkedList<>();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<n;j++){
                matches[i].addLast(in.nextInt());
            }
        }
        int day=0;
        boolean run = true;
        while (run){
            run=false;
            int[] check  = new int[n+1];
            for (int i=1;i<=n;i++){
                if(matches[i].size()>0 && check[i]==0){
                    int next = matches[i].get(0);
                    if(matches[next].size()>0 && matches[next].get(0)==i && check[next]==0){
                        matches[i].removeFirst();
                        matches[next].removeFirst();
                        check[i]=1;check[next]=1;
                        run=true;
                    }
                }
            }
            if(run)
                day++;
        }
        for(int i=1;i<=n;i++){
            if(matches[i].size()>0){
                System.out.println(-1);
                return;
            }

        }
        System.out.println(day);
    }
}
