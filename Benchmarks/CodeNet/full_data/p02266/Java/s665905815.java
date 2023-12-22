import java.util.Scanner;
import java.util.Stack;

public class Main {


    static class Pair{
        public final int first;
        public final int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> so = new Stack<Integer>();
        Stack<Pair> ps = new Stack<Pair>();
        int sum = 0;
        char[] chars = null;
        if (sc.hasNextLine()){
            String line = sc.nextLine();
            chars = line.toCharArray();
        }
        for(int i = 0; i < chars.length; i++){
            if(chars[i] == '\\'){
                so.push(i);
            }
            else if(chars[i] == '/' && so.size() > 0){
                int j = so.peek();
                so.pop();
                sum += i - j;
                int a = i - j;//区域面和
                while(ps.size() > 0 && ps.peek().first > j){
                    a += ps.peek().second;
                    ps.pop();
                }
                ps.push(new Pair(j,a));
            }
        }


        Stack<Integer> s = new Stack<Integer>();
        while (ps.size() > 0){
            s.push(ps.peek().second);
            ps.pop();
        }
        System.out.println(sum);
        System.out.print(s.size());
        while (s.size() > 0){
            System.out.print(" " + s.peek());
            s.pop();
        }
        System.out.println();
    }
}

