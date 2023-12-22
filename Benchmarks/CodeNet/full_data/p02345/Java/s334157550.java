import java.util.Scanner;

    class Main {
        public static void main (String[] args) throws java.lang.Exception {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt(), q = sc.nextInt();
            Solution sol = new Solution();

            Node root = sol.buildTree(0, n - 1);

            for(int i = 0; i < q; i++) {
                int c = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
                if(c == 0) sol.update(root, y, x);
                else System.out.println(sol.query(x, y, root));
            }
        }
    }
    class Node{
        int start;
        int end;
        int min;
        Node left;
        Node right;
        Node(int s, int e){
            start = s;
            end = e;
            min = Integer.MAX_VALUE;
        }
    }

    class Solution{
        public Node buildTree(int start, int end){
            if(start == end){
                return new Node(start, end);
            }

            int mid = (start + end)/2;

            Node left = buildTree(start, mid);
            Node right = buildTree(mid + 1, end);

            Node root = new Node(start, end);
            root.left = left;
            root.right = right;
            return root;
        }

        public void update(Node root, int val, int index){
            if(root.start == index && root.end == index){
                root.min = val;
                return;
            }

            int mid = root.start + (root.end - root.start)/2;

            if(index <= mid){
                update(root.left, val, index);
            }else{
                update(root.right, val, index);
            }

            root.min = Math.min(root.left.min, root.right.min);
        }

        public int query(int start, int end, Node root){
            if(root.start > end || root.end < start ) return Integer.MAX_VALUE;
            if(root.start == start && root.end == end){
                return root.min;
            }

            int mid = root.start + (root.end - root.start)/2;

            if(end <= mid){
                return query(start, end, root.left);
            }else if(start > mid){
                return query(start, end, root.right);
            }else{
                int left = query(start, mid, root.left);
                int right = query(mid + 1, end, root.right);
                return Math.min(left, right);
            }

        }
    }


