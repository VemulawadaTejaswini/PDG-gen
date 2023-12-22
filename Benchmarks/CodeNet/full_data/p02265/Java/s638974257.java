package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NodeList node = new NodeList();
        long n = Long.parseLong(scan.next());

        for(long i=0; i<n; i++) {
            String query = scan.next();
            if(query.equals("insert")) {
                long x = Long.parseLong(scan.next());
                node.Insert(x);
            }else if(query.equals("delete")) {
                long x = Long.parseLong(scan.next());
                node.SearchDelete(x);
            }else if(query.equals("deleteFirst")) {
                node.DeleteFirst();
            }else if(query.equals("deleteLast")) {
                node.DeleteLast();
            }
        }
        node.Print();
    }
}

class NodeList{
    NodeList.Node head;

    class Node{
        long key ;
        NodeList.Node right;
        NodeList.Node left;

        Node(long key){
            this.key = key;
        }

        Node(){
            this.key = -1;
        }

        public String toString(){
            return Long.toString(key);
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

    public void Insert(long x){
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
        System.out.println('\n');
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

    public void SearchDelete(long x){
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
