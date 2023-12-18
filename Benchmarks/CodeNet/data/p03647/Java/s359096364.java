import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;


class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static PrintWriter pw = new PrintWriter(System.out);
    public static String line;
    public static StringTokenizer st;
    public static ArrayList<ArrayList<Integer>> adjList;
    public static int[] dx = {-1, 0, 1, 0, -1, 1, 1, -1};
    public static int[] dy = {0, 1, 0, -1, 1, 1, -1, -1};
    public static int INF = 0x3f3f3f3f;
    public static long LINF = 0x3f3f3f3f3f3f3f3fL;
    public static int MOD = 1000000007;

    public static void main(String[] args) throws Exception{
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashSet<Integer> A = new HashSet<Integer>();
        HashSet<Integer> B = new HashSet<Integer>();
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a == 1){
                A.add(b);
            } else if(a == N){
                B.add(b);
            }

            if(b == 1){
                A.add(a);
            } else if(b == N){
                B.add(a);
            }
        }

        boolean f = false;
        for(int a : A){
            if(B.contains(a)){
                f = true;
                break;
            }
        }

        pw.print(f ? "POSSIBLE\n" : "IMPOSSIBLE\n");

        pw.close(); 
        br.close();
    }
}

class Pair implements Comparable<Pair>{
    public int a, b;

    Pair(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int compareTo(Pair p){
        if(a != p.a) return a - p.a;
        return b - p.b;
    }
}

class Trie{
    private Node root;
    
    Trie(){
        root = new Node('$');            
    }
    
    private void insert(Node root, String word, int index){
        if(index >= word.length()) return;
        char c = word.charAt(index);
        if(!root.children.containsKey(c)){
            root.addChild(c);
        }
        Node next = root.children.get(c);
        insert(next, word, index+1);
    }
    
    public void insert(String word){
        insert(root, word, 0);
    }
    
    public String find(String word){
        return find(root, word, 0);
    }

    public String find(Node root, String word, int index){
        if(index >= word.length()) return "";
        char c = word.charAt(index);
        if(!root.children.containsKey(c)){
            return "";
        }
        Node next = root.children.get(c);
        return word.charAt(index) + find(next, word, index+1);
    }
}


class Node{
    public char c;
    public HashMap<Character, Node> children;
    
    Node(char c){
        this.c = c;
        this.children = new HashMap<Character, Node>();
    }
    
    public void addChild(char c){
        this.children.put(c, new Node(c));
    }
}