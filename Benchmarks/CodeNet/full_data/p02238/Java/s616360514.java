import java.io.*;
import java.util.*;

public class Main {
    public static Node node[];
    public static int cnt = 1;
    public static int status[];
    public static int s[];
    public static int e[];
    
    private static class Node{
        int id;
        int next_size;
        int next[];
        
        Node(int u, int k){
            this.id = u;
            this.next_size = k;
            this.next = new int[k+1];
        }
    }
    
    private static void printNode(Node head){
        System.out.println("head.id = " + head.id);
        System.out.println("head.next_size = " + head.next_size);
        for (int i = 1; i < head.next_size + 1; i++){
            System.out.println("head.id = " + head.id + "  head.next[ " + i + " ] = " + head.next[i]);
            if (node[head.next[i]].next_size !=0){
                printNode(node[head.next[i]]);
            }
        }
    }
    
    private static void stackNode(Node head){
    
        
        if (status[head.id] == 0) {
            s[head.id] = cnt++;
            //System.out.println(head.id + " cnt = " + cnt);
            
        }
        
        if (status[head.id] != 2 ) {
            status[head.id] = 1;
        
            for (int i = 1 ; i < head.next_size + 1; i++){
                if(status[head.next[i]]==0){
                    if (head.id !=head.next[i]){
                        stackNode(node[head.next[i]]);
                    }
                }
                
            }
            
            status[head.id] = 2;
            e[head.id] = cnt++;
            //System.out.println(head.id + " cnt = " + cnt);


        }
       
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        node = new Node[n + 1];
        status = new int[n + 1];
        s = new int[n + 1];
        e = new int[n + 1];
        
        for (int i = 1; i < n + 1; i++){
            int u = in.nextInt();
            int k = in.nextInt();
            
            node[i] = new Node(u,k);
            for (int j = 1; j < k + 1; j++){
                
                node[i].next[j] = in.nextInt();
            }
        }
        
        /*
        for(int i = 1; i < n + 1; i++){
            Node head = node[i];
            if (status[head.id]==0){
                printNode(node[i]);
            }
        }
        */
       
        for(int i = 1; i < n + 1; i++){
            Node head = node[i];
            if (status[head.id]==0){
                 stackNode(head);      
            }
        }
      
        
     
        for (int i = 1; i < n + 1; i++){
            System.out.println(node[i].id + " " + s[i] + " " + e[i]);
        }
    }  
}