import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        int a = 0;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        ArrayDeque<Integer[]> stack2 = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++){
            if(s.substring(i, i+1).equals("\\")){
                stack.push(i);
            }else if(s.substring(i, i+1).equals("/")){
                if(!stack.isEmpty()){
                    int j = stack.pop();
                    a += i - j;
                    int k = 0;
                    while(!stack2.isEmpty() && j < stack2.peek()[0]){
                        k += stack2.pop()[1];
                    }
                    Integer[] b = new Integer[2];
                    b[0] = j;
                    b[1] = k + i - j;
                    stack2.push(b);
                }
            }
        }
        
        int k = stack2.size();
        StringBuilder sb = new StringBuilder();
        sb.append(a).append(System.lineSeparator());
        sb.append(k).append(" ");
        int[] b = new int[k];
        for(int i = 0; i < k; i++){
            b[b.length-1-i] = stack2.pop()[1];
        }
        for(int i = 0; i < k; i++){
            sb.append(b[i]).append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        
        System.out.println(sb);
    }
}
