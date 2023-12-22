import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        int n = s.length();
        int i = 0;
        while (i < n) {
            char ch = s.charAt(i);
            switch (ch) {
                case '(':
                    stack.push(ch);
                    break;
                case ')':
                    boolean ok = false;
                    if (stack.size() == 0) {
                        return false;
                    }   
                    char p1 = stack.pop();
                    if (ch == ')') {
                        ok = p1 == '(';
                    } else {
                        return false;
                    }   
                    if (!ok) return false;
                    break;
                default:
                    System.exit(1);
            }   
            i++;
        }   
        return stack.size() == 0;
    } 

    private String d2str(Deque<Character> deque) {
        StringBuffer sb = new StringBuffer();
        while (!deque.isEmpty()) {
            char ch = deque.pollFirst();
            sb.append(ch);
        }
        // sb.reverse();
        return sb.toString();
    }

    public String simplify(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        int n = s.length();
        int i = 0;
        while (i < n) {
            char ch = s.charAt(i);
            switch (ch) {
                case '(':
                    stack.push(ch);
                    break;
                case ')':
                    boolean ok = false;
                    if (stack.size() == 0) {
                        for (;i < n; i++) stack.push(s.charAt(i));
                        return d2str(stack);
                    }   
                    char p1 = stack.pop();
                    if (ch == ')') {
                        ok = p1 == '(';
                    } else {
                        for (;i < n; i++) stack.push(s.charAt(i));
                        return d2str(stack);
                    }   
                    if (!ok) {
                        for (;i < n; i++) stack.push(s.charAt(i));
                        return d2str(stack);
                    }
                    break;
                default:
                    System.exit(1);
            }   
            i++;
        }
        return d2str(stack);
	}


    public void permutation(List<String> q, String ans) {
        if (q.size() <= 1) {
            String str = ans + q.get(0);
            System.out.println(str);
            if (isValid(str)) {
                System.out.println("Yes");
                System.exit(0);
            }   
        } else {
            for (int i = 0; i < q.size(); i++) {
                ArrayList<String> a = new ArrayList<>(q);
                a.remove(i);
                permutation(a, ans + q.get(i));
            }   
        }   
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //System.out.println("============");
        List<String> S = new ArrayList<String>();
        for (int i = 0; i < N; i++) {
            String s = sc.next();
            String ss = simplify(s);
            if (!ss.equals("")) S.add(ss);
            //System.out.println(s);
        }
        //System.out.println("============");
        permutation(S, "");
        System.out.println("No");

        return;
    }

}