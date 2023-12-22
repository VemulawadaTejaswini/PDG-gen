import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NodeList node = new NodeList();
        int n = Integer.parseInt(scan.next());
        int x;
        for(int i=0; i<n; i++) {
            String query = scan.next();
            switch (query) {
                case "insert":
                    x = Integer.parseInt(scan.next());
                    node.Insert(x);
                    break;
                case "delete":
                    x = Integer.parseInt(scan.next());
                    node.SearchDelete(x);
                    break;
                case "deleteFirst":
                    node.DeleteFirst();
                    break;
                case "deleteLast":
                    node.DeleteLast();
                    break;
            }
        }
        node.Print();
    }
}

class NodeList{
    NodeList.Node head;

    class Node{
        int key ;
        NodeList.Node right;
        NodeList.Node left;

        Node(int key){
            this.key = key;
        }

        Node(){
            this.key = -1;
        }

        public String toString(){
            return Integer.toString(key);
        }

        public void printDetail(){
            System.out.println(this.left.key + ' ' + this.key +' ' + this.right.key);
        }
    }

    NodeList(){
        this.head = new NodeList.Node();
        this.head.right = this.head;
        this.head.left = this.head;
    }

    public void Insert(int x){
        NodeList.Node newNode = new NodeList.Node(x);
        newNode.right = this.head.right;
        newNode.right.left = newNode;
        this.head.right = newNode;
        newNode.left = this.head;
    }

    public void Print(){
        NodeList.Node point = this.head.right;
        NodeList.Node start = this.head.right;
        boolean flag = false;
        while(point != this.head) {
            System.out.print(point.toString());
            point = point.right;
            if (flag && point == start) {
                break;
            }
            if (point != this.head) {
                System.out.print(' ');
            }
            flag = true;
        }
        System.out.println("");
    }

    public void PrintAll() {
        System.out.println(this.head);
        NodeList.Node point = this.head.right;
        while(point != this.head) {
            point.printDetail();
            point = point.right;
        }
        System.out.println('\n');
    }

    public void Delete(NodeList.Node point){
        point.right.left = point.left;
        point.left.right = point.right;
    }

    public void SearchDelete(int x){
        NodeList.Node point = this.head.right;
        while(point != this.head) {
            if(point.key == x) break;
            point = point.right;
        }
        this.Delete(point);
    }

    public void DeleteFirst(){
        this.Delete(this.head.right);
    }

    public void DeleteLast(){
        this.Delete(this.head.left);
    }

}

