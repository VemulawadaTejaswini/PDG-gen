import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Deque<Integer> dq = new ArrayDeque<Integer>();
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = sc.nextInt();
            for(int i = 0 ; i < n ; i++){
                String command = br.readLine();
                if(command.equals("deleteFirst"))
                    dq.removeFirst();
                else if(command.equals("deleteLast"))
                    dq.removeLast();
                else{
                    String[] str = command.split(" ",1);
                    if(str[0].equals("delete"))
                        dq.remove(Integer.parseInt(str[1]));
                    else
                        dq.addFirst(Integer.parseInt(str[1]));
                }
            }
            System.out.print(dq.removeFirst());
            Iterator i = dq.iterator();
            while(i.hasNext()){
                sb.append(" " + i.next());
            }
            System.out.println(sb);
    }
}
