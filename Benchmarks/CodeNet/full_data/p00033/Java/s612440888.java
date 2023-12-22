import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        while(n-->0) {
            Integer[] list = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
            Deque<Integer> stack1=new ArrayDeque<>();
            Deque<Integer> stack2=new ArrayDeque<>();
            stack1.push(list[0]);
            for(int i=1;i<list.length;i++) {
                if(stack1.peek()<list[i]) {
                    stack1.push(list[i]);
                }else if(stack2.isEmpty()) {
                    stack2.push(list[i]);
                }else if(stack2.peek()<list[i]) {
                    stack2.push(list[i]);
                }else {
                    System.out.println("NO");
                    break;
                }
            }
            if(stack1.size()+stack2.size()==list.length) {
                System.out.println("YES");
            }
        }
    }
}
