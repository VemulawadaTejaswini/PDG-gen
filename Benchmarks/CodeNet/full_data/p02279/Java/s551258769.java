import java.io.*;
import java.util.*;

public class Main {
    public static Node node[];
    public static String nodetype[];
 
    private static class Node{
        int id;
        int parent;
        int next_size;
        int next[];
        
        Node(int u, int k){
            this.id = u;
            this.parent = -1;
            this.next_size = k;
            this.next = new int[k];
        }
    }
    
    public static int depth(Node child){
        int cnt = 0;
        
        if (child.parent == -1)return cnt;
        
        cnt = depth(node[child.parent]) + 1;
        
        return cnt;
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        node = new Node[n];
        nodetype = new String[n];
        
        for (int i = 0; i < n; i++){
            int u = in.nextInt();
            int k = in.nextInt();
            
            node[u] = new Node(u,k);
            
            for (int j = 0; j < k; j++){
                node[u].next[j] = in.nextInt();
            }
        }
        
        for(int i = 0; i < n; i++){
            Node head = node[i];
            for(int j = 0; j < head.next_size; j++){
                node[head.next[j]].parent = head.id;
            }
        }
        
        for(int i = 0; i < n; i++){
            Node head = node[i];
            if(node[head.id].parent == -1){
                nodetype[i] = "root";
            }else if(node[head.id].next_size > 0){
                nodetype[i] = "internal node";
            }else if(node[head.id].next_size == 0){
                nodetype[i] = "leaf";
            }
        }
        
        
        
        for(int i = 0; i < n; i++){
            Node head = node[i];
            if (nodetype[i] != "leaf"){
                System.out.print("node " + head.id + ": parent = " + head.parent + ", depth = " + depth(head) + ", "+ nodetype[i] + ", [");
                if (head.next_size == 0)System.out.println("]");
                for(int j = 0; j < head.next_size; j++){
                    if (j != head.next_size-1){
                        System.out.print(head.next[j] + ", ");
                    }else{
                        System.out.println(head.next[j] + "]");
                    }
                }
            }else if(nodetype[i] == "leaf"){
                System.out.println("node " + head.id + ": parent = " + head.parent + ", depth = " + depth(head)  + ", " + nodetype[i] + ", []");
            }

        }
      
    }  
}