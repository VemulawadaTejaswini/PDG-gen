import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Deque<Integer> dq = new ArrayDeque<Integer>();
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int n = sc.nextInt();
            for(int i = 0 ; i < n ; i++){
                String command = br.readLine();
                
            }
            System.out.print(dq.removeFirst());
            Iterator i = dq.iterator();
            while(i.hasNext()){
                sb.append(" " + i.next());
            }
            System.out.println(sb);
        }catch(IOException e){}
    }
}
