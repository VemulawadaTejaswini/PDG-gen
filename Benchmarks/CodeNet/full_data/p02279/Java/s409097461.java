import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;
import java.util.Arrays;

public class Main {
    public static class Node {
        private int id;
        private int depth;
        private String childString;
        private Node parent;
        private Node mostLeftChild;
        private Node rightBrother;
        
        public Node(int id) {
            this.id = id;
            this.depth = 0;
            this.childString = "";
            this.parent = null;
            this.mostLeftChild = null;
            this.rightBrother = null;
        }
        
        public void setParent(Node parent) {
            this.parent = parent;
        }
        
        public void setChild(Node child) {
            if(this.mostLeftChild == null) {
                this.mostLeftChild = child;
                return;
            }
            
            this.mostLeftChild.setBrother(child);
        }
        
        public void setBrother(Node brother) {
            if(this.rightBrother == null) {
                this.rightBrother = brother;
                return;
            }

            this.rightBrother.setBrother(brother);
        }
        
        public int getId() {
            return this.id;
        }
        
        public int getDepth() {
            return this.depth;
        }
        
        public String getType() {
            if(this.parent == null) {
                return "root";
            } else if(this.mostLeftChild == null) {
                return "leaf";
            } else {
                return "internal node";
            }
        }
        
        public int getParentId() {
            if(this.parent == null) {
                return -1;
            }
            return this.parent.getId();
        }
        
        public String getBrotersId() {
            if(this.rightBrother == null) {
                return String.valueOf(this.id);
            }
            
            String brothersId = this.rightBrother.getBrotersId();
            return String.valueOf(this.id) + ", " + brothersId;
        }
        
        public String getChildrenId() {
            if(this.mostLeftChild == null) {
                return "[]";
            }
            
            return "[" + this.mostLeftChild.getBrotersId() + "]";
        }
        
        public void calcDepth(int d) {
            this.depth = d;
            
            if(this.rightBrother != null) {
                this.rightBrother.calcDepth(d);
            }
            
            if(this.mostLeftChild != null) {
                this.mostLeftChild.calcDepth(d + 1);
            }
        }
        
        public void print() {
            System.out.println("node " + this.id + ": parent = " + this.getParentId() + ", depth = " + this.depth + ", " + this.getType() + ", " + this.getChildrenId());
        }
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nodeNum = Integer.parseInt(br.readLine());
        Node[] nodes = new Node[nodeNum];
        
        for(int i = 0; i < nodeNum; i++) {
            int[] nodeInfo = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int id = nodeInfo[0];
            int k = nodeInfo[1];

            if(nodes[id] == null) {
                nodes[id] = new Node(id);
            }
            
            for(int j = 2; j < k + 2; j++) {
                int cid = nodeInfo[j];
                if(nodes[cid] == null) {
                    nodes[cid] = new Node(cid);
                }
                
                nodes[cid].setParent(nodes[id]);
                nodes[id].setChild(nodes[cid]);
            }
        }
        
        int rootId = 0;
        for(int i = 0; i < nodes.length; i++) {
            if(nodes[i].getParentId() == -1) {
                rootId = i;
                break;
            }
        }
        
        nodes[rootId].calcDepth(0);
        
        for(Node node : nodes) {
            node.print();
        }
    }
}