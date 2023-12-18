import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Atcoder_dp_A {
    static class Node implements Comparable<Node>{
        int index;
        int cost;
        Node(int index,int cost){
            this.index = index;
            this.cost = cost;
        }
        public int compareTo(Node other){
            if(this.cost == other.cost)
                return 0;
            else if(this.cost > other.cost)
                return 1;
            else
                return -1;
        }
    }
    public static void bfs(int[] arr){
        LinkedList<Node> queue = new LinkedList<Node>();
        LinkedList<Node> res = new LinkedList<Node>();
        queue.add(new Node(0,0));
        while (!queue.isEmpty()){
            Node current = queue.poll();
            if(current.index == arr.length-1){
                res.add(current);
            }
            if(current.index + 1 < arr.length){
                queue.add(new Node(current.index+1,current.cost + Math.abs(arr[current.index+1] - arr[current.index])));
            }
            if(current.index+2 < arr.length){
                queue.add(new Node(current.index+2,current.cost + Math.abs(arr[current.index+2] - arr[current.index])));
            }
        }
        Collections.sort(res);
        System.out.println(res.get(0).cost);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = input.nextInt();
        }
        bfs(arr);
    }
}
