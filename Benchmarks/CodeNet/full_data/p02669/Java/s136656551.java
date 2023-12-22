import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            solve(sc);
        }
    }
    static void solve(Scanner sc) {
        long n = sc.nextLong();
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();

        Set<Long> visited = new HashSet<>();
        PriorityQueue<Node> q = new PriorityQueue<>();
        q.offer(new Node(n, 0));
        long md = Long.MAX_VALUE / d;
        while(!q.isEmpty()) {
            Node node = q.poll();
            long num = node.n;
            if(visited.contains(num)) {
                continue;
            }
            visited.add(num);
            if(node.n == 1) {
                System.out.println(node.d + d);
                return;
            }
            if(num%2 == 0) {
                if(!visited.contains(num/2)) {
                    q.offer(new Node(num/2, node.d + Math.min(a, d * Math.min(md,num/2))));
                }
            } else {
                if(!visited.contains((num-1)/2)) {
                    q.offer(new Node((num-1)/2, node.d + d + Math.min(a, d *  Math.min(md,(num-1)/2))));
                }
                if(!visited.contains((num+1)/2)) {
                    q.offer(new Node((num+1)/2, node.d + Math.min(a + d, d * Math.min(md, (num - (num-1)/2)))));
                }
            }
            if(num%3 == 0) {
                if(!visited.contains(num/3)) {
                    q.offer(new Node(num/3, node.d + Math.min(b, d * Math.min(md, num/3 * 2))));
                }
            } else {
                int r = (int)(num % 3);
                int p = 3 - r;
                if(!visited.contains((num-r)/3)) {
                    q.offer(new Node((num-r)/3, node.d + Math.min(d * r + b, Math.min(md, (num-(num-r)/3)) * d)));
                }
                if(!visited.contains((num+p)/3)) {
                    q.offer(new Node((num+p)/3, node.d + Math.min(d * p + b, Math.min(md, (num-(num+p)/3)) * d)));
                }
            }
            if(num%5 == 0) {
                if(!visited.contains(num/5)) {
                    q.offer(new Node(num/5, node.d + Math.min(c, d * Math.min(md, (num - num/5)))));
                }
            } else {
                int r = (int)(num % 5);
                int p = 5 - r;
                if(!visited.contains((num-r)/5)) {
                    q.offer(new Node((num-r)/5, node.d + Math.min(d * r + c, Math.min(md, (num-(num-r)/5)) * d)));
                }
                if(!visited.contains((num+p)/5)) {
                    q.offer(new Node((num+p)/5, node.d + Math.min(d * p + c, Math.min(md, (num-(num+p)/5)) * d)));
                }
            }
        }

    }

    static class Node implements Comparable<Node>{
        long n;
        long d;
        Node(long n, long d) {
            this.n = n;
            this.d = d;
        }
        @Override
        public int compareTo(Node node) {
            return Long.compare(d, node.d);
        }
    }

}