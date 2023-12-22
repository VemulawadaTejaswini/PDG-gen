import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;

public class Main{

    public static void main(String[] args) throws IOException
{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> list = new ArrayDeque<Integer>();
        for(int i = 0; i < n; i++){
            String[] in = br.readLine().split(" ");
            if(in[0].equals("insert")){
                int key = Integer.parseInt(in[1]);
                list.addFirst(key);
            }else if(in[0].equals("deleteFirst")){
                list.removeFirst();
            }else if(in[0].equals("deleteLast")){
                    list.removeLast();
            }else if(in[0].equals("delete")){
                int key = Integer.parseInt(in[1]);
                list.remove((Integer)key);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(list.poll());
        for(int num: list){
            sb.append(" ").append(num);
        }
        System.out.println(sb);
    }
}