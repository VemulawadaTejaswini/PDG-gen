import java.util.Scanner;

public class Main {


    static class Node{
        int parent;
        int left;
        int right;

        Node(){
            this.parent = -1;
            this.left = -1;
            this.right = -1;
        }
    }


    static Node[] T;
    static int R;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        T = new Node[n];
        int l,r,t;
        for(int i = 0; i < n; i ++){
            T[i] = new Node();
        }

        for(int i = 0; i < n; i ++){
            t = sc.nextInt();
            l = sc.nextInt();
            r = sc.nextInt();
            if(l != -1){
                T[t].left = l;
                T[l].parent = t;
            }
            if( r != -1){
                T[t].right = r;
                T[r].parent = t;
            }
        }

        for(int i = 0 ; i < n; i ++){
            if(T[i].parent == -1){
                R = i;
                break;
            }
        }

        String out;
        System.out.println("Preorder");
        out = preOrder(R);
        System.out.println(out.trim());

        System.out.println("Inorder");
        out = inOrder(R);
        System.out.println(out.trim());


        System.out.println("Postorder");
        out = postOrder(R);
        System.out.println(out.trim());
    }



    static String preOrder(int u){
        String out = " ";
        if(u == - 1) return out;
        out += u;
        out += preOrder(T[u].left);
        out += preOrder(T[u].right);
        return out;
    }


    static String inOrder(int u){
        String out = " ";
        if(u == -1) return out;
        out += inOrder(T[u].left);
        out += u;
        out += inOrder(T[u].right);
        return out;
    }

    static String postOrder(int u){
        String out = " ";
        if(u == -1) return out;
        out += postOrder(T[u].left);
        out += postOrder(T[u].right);
        out += u;
        return out;
    }

}

