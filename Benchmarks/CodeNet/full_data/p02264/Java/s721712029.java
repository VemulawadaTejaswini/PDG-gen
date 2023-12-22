import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int q = s.nextInt();
 
        Queue<String> queP = new LinkedList<String>();
        Queue<Integer> queT = new LinkedList<Integer>();
 
        int time = 0;
 
        for (int i = 0; i < n; i++) {
            queP.add(s.next());
            queT.add(s.nextInt());
        }
 
        while (queP.size() != 0) {
            if (queT.peek() - q >0) {
                queP.add(queP.poll());
                queT.add(queT.poll()-q);
                time += q;
            }else {
                time += queT.poll();
                System.out.println(queP.poll() + " " + time);
            }
        }
    }
}

