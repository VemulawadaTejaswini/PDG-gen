public class Main {
    static List<NODE> T = new ArrayList<Main.NODE>();
 
    static class NODE {
        public int key;
        public NODE left;
        public NODE right;
        public NODE parent;
    }
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String str = br.readLine().trim();
 
            if (str.equals("print")) {
                print();
            } 
            else if (str.startsWith("insert")) {
                insert(Integer.parseInt(str.split(" ")[1]));
            } 
            else if (str.startsWith("find")) {
                find(Integer.parseInt(str.split(" ")[1]));
            } 
            else if (str.startsWith("delete")) {
                delete(Integer.parseInt(str.split(" ")[1]));
            }
        }
 
        if (br != null) {
            br.close();
            br = null;
        }
    }
 
    static void print() {
        NODE root = T.size() == 0 ? null : T.get(0);
 
        List<Integer> tmp = new ArrayList<Integer>();
        inorder(root, tmp);
        for (int i : tmp) {
            System.out.print(" " + i);
        }
        System.out.println();
 
        tmp = new ArrayList<Integer>();
        preorder(root, tmp);
        for (int i : tmp) {
            System.out.print(" " + i);
        }
        System.out.println();
    }
 
    private static void inorder(NODE node, List<Integer> ret) {
        if (node == null) {
            return;
        }
 
        inorder(node.left, ret);
        ret.add(node.key);
        inorder(node.right, ret);
    }
 
    private static void preorder(NODE node, List<Integer> ret) {
        if (node == null) {
            return;
        }
 
        ret.add(node.key);
        preorder(node.left, ret);
        preorder(node.right, ret);
    }
 
    private static void insert(int key) {
        NODE z = new NODE();
        z.key = key;
 
        NODE y = null;
        NODE x = T.size() == 0 ? null : T.get(0);
        while (x != null) {
            y = x;
            if (z.key < x.key) {
                x = x.left;
            }
            else {
                x = x.right;
            }
        }
        z.parent = y;
        
        if (y == null) {
            T.add(z);
        } 
        else if (z.key < y.key) {
            y.left = z;
        } 
        else {
            y.right = z;
        }
    }
 
    static void find(int key) {
        NODE root = T.size() == 0 ? null : T.get(0);
        System.out.println(find(root, key) != null ? "yes" : "no");
    }
 
    private static NODE find(NODE node, int key) {
        
        if (node == null) {
            return null;
        }
 
        if (node.key == key) {
            return node;
        } 
        else if (node.key > key) {
            return find(node.left, key);
        } 
        
        else {
            return find(node.right, key);
        }
    }
 
    private static void delete(int key) {
        NODE root = T.size() == 0 ? null : T.get(0);
        NODE z = find(root, key);
        NODE y;
        
        if (z.left == null || z.right == null) {
            y = z;
        } 
        
        else {
            y = successor(z);
        }
 
        NODE x;
        if (y.left != null) {
            x = y.left;
        } 
        
        else {
            x = y.right;
        }
 
        if (x != null) {
            x.parent = y.parent;
        }
        
        if (y.parent == null) {
            T.set(0, x);
        }
        
        else if (y == y.parent.left) {
            y.parent.left = x;
        }
        
        else {
            y.parent.right = x;
        }
 
        if (y != z) {
            z.key = y.key;
        }
    }
 
    private static NODE successor(NODE x) {
        
        if (x.right != null) {
            return minimum(x.right);
        }
        NODE y = x.parent;
        
        while (y != null && x == y.right) {
            x = y;
            y = y.parent;
        }
        
        return y;
    }
 
    private static NODE minimum(NODE x) {
        
        while (x.left != null)
            x = x.left;
        
        return x;
    }
}