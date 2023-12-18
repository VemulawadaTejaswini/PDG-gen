import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    static class An {
        public int v;
        public int n;

        public An(int v, int n) {
            this.v = v;
            this.n = n;
        }
    }

    public static final An Anchor = new An(-1, -1);

    public static final An Empty = new An(0, 0);

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = Integer.valueOf(s.nextLine());
        LinkedList<An> ans = new LinkedList<>();

        String[] anString = s.nextLine().split(" ");
        for (int i = 0; i < anString.length; i ++) {
            ans.add(new An(Integer.parseInt(anString[i]), i + 1));
        }
        ans.add(Anchor);

        int left = 1;
        int right = anString.length;

        int happy = 0;
        An current = Empty;
        int currentHappy = 0;
        while(!ans.isEmpty()) {
            An head = ans.pop();

            if (head == Anchor) {
                int leftHappy = Math.abs(current.n - left);
                int rightHappy = Math.abs(current.n - right);
                if (leftHappy > rightHappy) {
                    //System.out.println(current.v + ":" + current.n + " => move to left " + left + " (" + current.v*leftHappy + ")");
                    left++;
                    happy += current.v*leftHappy;
                } else {
                    //System.out.println(current.v + ":" + current.n + " => move to right " + right + " (" + current.v*rightHappy + ")");
                    right--;
                    happy += current.v*rightHappy;
                }

                if (ans.isEmpty()) {
                    break;
                }

                ans.add(Anchor);
                current = Empty;
                currentHappy = -1;
                continue;
            }

            int headHappy = head.v*Math.max(Math.abs(head.n - left), Math.abs(head.n - right));

            if (headHappy > currentHappy) {
                if (current != Empty) {
                    ans.add(current);
                }
                current = head;
                currentHappy = headHappy;
            } else {
                ans.add(head);
            }
        }

        System.out.println(happy);
    }
}