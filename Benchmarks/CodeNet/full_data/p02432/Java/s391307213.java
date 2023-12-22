import java.util.*;
// import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num_query = sc.nextInt();

        ArrayList<Integer> front = new ArrayList<>();
        ArrayList<Integer> rear = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num_query; i++) {
            int query_type = sc.nextInt();
            int d, x, p;
            switch (query_type) {
                case 0:
                    d = sc.nextInt();
                    x = sc.nextInt();
                    if (d == 0) front.add(x);
                    else rear.add(x);
                    break;
                case 1:
                    p = sc.nextInt();
                    int tmp;
                    if (p < front.size()) tmp = front.get(front.size() - 1 - p);
                    else tmp = rear.get(p - front.size());
                    sb.append(String.format("%d\n", tmp));
                    break;
                case 2:
                    d = sc.nextInt();
                    if (d == 0) {
                        if (front.isEmpty()) {
                            rear.remove(0);
                        } else {
                            front.remove(front.size() - 1);
                        }
                    } else {
                        if (rear.isEmpty()) {
                            front.remove(0);
                        } else {
                            rear.remove(rear.size() - 1);
                        }
                    }
                    break;
                default:
                    return;
            }
        }

        System.out.print(sb.toString());
        
        sc.close();
    }
}

