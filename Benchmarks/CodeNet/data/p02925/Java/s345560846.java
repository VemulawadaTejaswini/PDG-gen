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
        HashSet<Integer> num = new HashSet<>();
        for(int i=0;i<=n;i++){
            matches[i] = new LinkedList<>();
        }
        for(int i=1;i<=n;i++){
            num.add(i);
            for(int j=1;j<n;j++){
                matches[i].addLast(in.nextInt());
            }
        }
        int day=0;
        boolean run = true;
        HashSet<Integer> check = new HashSet<>();
        HashSet<Integer> temp = new HashSet<>();
        while (run){
            run=false;
            temp.clear();
            check.clear();
            int add =0;
            for (int i :num){
                if (matches[i].size()>0 &&!temp.contains(i)){
                    int next = matches[i].get(0);
                    if(!temp.contains(next)&& matches[next].get(0)==i){
                        temp.add(i);temp.add(next);
                        matches[i].removeFirst();matches[next].removeFirst();
                        run=true;
                    }
                }
            }
            if(run){
                day++;
            }
            num.clear();
            num.addAll(temp);

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
