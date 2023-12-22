import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;


public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<Integer>();
        
        String str = "";
        String command = "";
        int input = 0;
        for(int i =0; i < num; i++){
            str = br.readLine();
            command = str.substring(0, str.indexOf(" "));
            if(command.equals("insert")){
                input = Integer.parseInt(str.substring(str.indexOf(" ") + 1));
                deque.addFirst(input);
            }else if(command.equals("delete")){
                input = Integer.parseInt(str.substring(str.indexOf(" ") + 1));
                deque.removeFirstOccurrence(input);
            }else if(command.equals("deleteFirst")){
                deque.removeFirst();
            }else{
                deque.removeLast();
            }
        }
        StringBuilder output = new StringBuilder();
        output.append(deque.pollFirst());
        for(int x: deque){
            output.append(" " + x);
        }
        System.out.println(output);
    }
}
