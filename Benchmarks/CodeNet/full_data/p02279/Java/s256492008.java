import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] in;
        Node[] nodes = new Node[n];
        //for(int i = 0; i < n; i++) nodes[i] = new Node();                          
        for(int i = 0; i < n; i++){
            nodes[i] = new Node();
            in = br.readLine().split(" ");
            //nodes???index???id                                                       
            //nodes[i].id = Integer.parseInt(in[0]);                                 
            nodes[i].children = new int[Integer.parseInt(in[1])];
            for(int j = 0; j < Integer.parseInt(in[1]); j++){
                nodes[i].children[j] = Integer.parseInt(in[j + 2]);
                nodes[nodes[i].children[j]].parent = i;
            }

        }
        for(int i = 0; i < n; i++){
            nodes[i].depth = getDepth(nodes, i);
        }
        for(int i = 0; i < n; i++){
            if(nodes[i].depth == 0) nodes[i].type = "root";
            else if(nodes[i].children.length == 0) nodes[i].type = "leaf";
            else nodes[i].type = "internal node";
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append("node ").append(i).append(": ");
            sb.append("parent = ").append(nodes[i].parent).append(", ");
            sb.append("depth = ").append(nodes[i].depth).append(", ");
            sb.append(nodes[i].type).append(", ");
            sb.append("[");
            for(int j = 0; j < nodes[i].children.length; j++){
                if(j != 0) sb.append(", ");
                sb.append(nodes[i].children[j]);
            }
            sb.append("]\n");
        }
        System.out.print(sb);
    }
    public static int getDepth(Node[] nodes, int i){
        //if(parent == -1) return i;                                                 
        int ans_d = 0;
        while(nodes[i].parent != -1){
            i = nodes[i].parent;
            ans_d += 1;
        }
        return ans_d;
    }

}

class Node{
    //int id, parent, depth;                                                         
    int parent = -1, depth = 0;
    String type;
    int[] children;
}