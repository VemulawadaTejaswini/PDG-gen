import java.util.Scanner;

public class Main {
    
    static Node nil;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        init();
        int n = Integer.parseInt(sc.next());
        for(int i = 0; i < n; i++){
            String command = sc.next();
            switch (command) {
                case "insert":
                    insert(Integer.parseInt(sc.next()));
                    break;
                case "delete":
                    deleteKey(Integer.parseInt(sc.next()));
                    break;
                case "deleteFirst":
                    deleteFirst();
                    break;
                case "deleteLast":
                    deleteLast();
                    break;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        Node cur = nil.next;
        while(cur != nil){
            sb.append(cur.key).append(" ");
            cur = cur.next;
        }
        if(sb.length() != 0) sb.deleteCharAt(sb.length()-1);
        
        System.out.println(sb);
    }
    
    static void init(){
        nil = new Node();
        nil.next = nil;
        nil.prev = nil;
    }
    
    static void insert(int key){
        Node x = new Node();
        x.key = key;
        x.next = nil.next;
        nil.next.prev = x;
        nil.next = x;
        x.prev = nil;
    }
    
    static Node listSearch(int key){
        Node cur = nil.next;
        while(cur != nil && cur.key != key){
            cur = cur.next;
        }
        return cur;
    }
    
    static void deleteNode(Node t){
        if(t == nil) return;
        t.prev.next = t.next;
        t.next.prev = t.prev;
    }
    
    static void deleteFirst(){
        deleteNode(nil.next);
    }
    
    static void deleteLast(){
        deleteNode(nil.prev);
    }
    
    static void deleteKey(int key){
        deleteNode(listSearch(key));
    }
    
    static class Node {
        int key;
        Node prev;
        Node next;
    }
}
