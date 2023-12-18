import java.util.*;

public class Main{
    public static void main(String []args){
        Scanner inp = new Scanner(System.in);

        LinkedList link = new LinkedList<String>();
        link.add(inp.next());
        int num = inp.nextInt();
        int count=0;
        for(int i=0;i<num;i++){
            int in = inp.nextInt();
            if(in == 1){
                count++;
            }
            if(in == 2){
                int in2 = inp.nextInt();
                if(count % 2 ==0){
                    if(in2 == 1)
                        link.addFirst(inp.next());
                    else
                        link.addLast(inp.next());
                }
                else{
                    if(in2 == 1)
                        link.addLast(inp.next());
                    else
                        link.addFirst(inp.next());
                }
            }
        }
        int t = 0;
        System.out.println(link.size());
        int s = link.size();
        if(count % 2 == 0){
            for(int i =0;i<s;i++){
                System.out.print(link.poll());
            }
        }
        else
            for(int i =0;i<s;i++){
                System.out.print(link.pollLast());
        }
        System.out.println();
        inp.close();
    }
}