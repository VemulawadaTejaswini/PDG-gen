import java.util.Scanner;

public class Main {

   static class Node{
        int key;
        Node parent;
        Node left;
        Node right;
    }

    static Node T;

    static void insert(Node z){
        Node y = null;
        Node R = T;
        while (R != null){
            y = R;
            if(z.key < R.key){
                R = R.left;
            }
            else {
                R = R.right;
            }
        }

        z.parent = y;
        if(y == null){
            T = z;
        }
        else if(z.key < y.key){
            y.left = z ;
        }
        else if(z.key > y.key){
            y.right = z;
        }
    }

    static int idx = 0;
    static void inOrder(Node u){
        if(u == null) return;

        inOrder(u.left);
        print(u.key);
        inOrder(u.right);
    }

    static void preOrder(Node u){
        if(u == null) return;

        print(u.key);
        preOrder(u.left);
        preOrder(u.right);
    }


    static void print(int k){
        if(idx == 0){
            idx ++;
            System.out.print(k);
        }else{
            System.out.print(" " + k);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node temp;
        for(int i = 0 ; i < n; i ++){
            String oper = sc.next();
            if("insert".equals(oper)){
                int key = sc.nextInt();
                temp = new Node();
                temp.key = key;
                insert(temp);
            }else{
                inOrder(T);
                System.out.println();
                idx = 0;
                preOrder(T);
            }
        }
        System.out.println();
    }
}

