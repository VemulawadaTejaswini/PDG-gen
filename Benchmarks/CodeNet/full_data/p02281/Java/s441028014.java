import java.util.*;
import java.io.*;

public class Main{
    static StringBuffer sb=new StringBuffer();
    static class Node{
        int nodeNumber;
        Node parent;
        Node opposite;
        Node leftChild;
        Node rightChild;
        int depth;
        int height;
        ArrayList<Node> childList=new ArrayList<Node>();

        int getDepth(){
            int depth=0;
            Node that=this.parent;
            while(that!=null){
                depth++;
                that=that.parent;
            }
            this.depth=depth;
            return depth;
        }
        
        int h1=0;
        int h2=0;
        int getHeight(){
            if(childList.size()==0){return 0;}
            Node leftChild;
            Node rightChild;

            if(childList.size()>=1){
                leftChild=childList.get(0);
                h1=leftChild.getHeight()+1;
            }
            if(childList.size()==2){
                rightChild=childList.get(1);
                h2=rightChild.getHeight()+1;
            }
            height=Math.max(h1,h2);
            return height;

        }

    }
    public static void main (String args[]){

        //初期処理
        // Scanner sc=new Scanner(System.in);
        // int n=Integer.parseInt(sc.nextLine());
        // String[] sElementArray=sc.nextLine().split(" ");
        // int[] array=Arrays.stream(sElementArray).mapToInt(Integer::parseInt).toArray();
        // sc.close();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       try{
            int n= Integer.parseInt(br.readLine());
            Node rootNode=null;

            //Node管理用の配列
            Node[] allNode=new Node[n];
            for(int s=0;s<n;s++){
                allNode[s]=new Node();
            }

            for(int i=0;i<n;i++){
                String[] sElementArray = br.readLine().split(" ");
                int[] array = Arrays.stream(sElementArray).mapToInt(Integer::parseInt).toArray();
                int N=array[0];
                int l=array[1];
                int r=array[2];

                //番号設定
                allNode[N].nodeNumber=N;
                
                //そのほか4つのプロパティを設定
                //array=[0,1,4]の子ノードをとる。
                if(l!=-1){
                    allNode[l].parent=allNode[N];   //左の子の親を自分に設定 
                    allNode[N].leftChild=allNode[l];
                    allNode[N].childList.add(allNode[l]);
                }
                if(r!=-1){
                    allNode[r].parent=allNode[N];   //子の親を自分に設定 
                    allNode[N].rightChild=allNode[r];
                    allNode[N].childList.add(allNode[r]);
                }
                         //   allNode[array[0]].leftChild=allNode[1];  //左の子を最初の子要素に設定
                if(array[1]!=-1&&array[2]!=-1){
                            allNode[array[1]].opposite=allNode[array[2]];  //sibling
                            allNode[array[2]].opposite=allNode[array[1]];  //sibling
                }
            }
            //find root
            for (int i=0;i<n;i++){
                if(allNode[i].parent==null){
                    rootNode=allNode[i];
                }
            }

            //preorder(root->left->right)
            sb.append("Preorder\n");
            preorder(rootNode);
            sb.append("\n");

            //inorder(left->root->right)
            sb.append("Inorder\n");
            inorder(rootNode);
            sb.append("\n");
            //postorder(left->right->root)
            sb.append("Postorder\n");
            postorder(rootNode);
            sb.append("\n");
            
            System.out.print(sb);
        }catch(IOException e){e.printStackTrace();}

    }
        static void preorder(Node x){
            sb.append(" "+x.nodeNumber);
            if(x.leftChild!=null){
                preorder(x.leftChild);
            }
            if(x.rightChild!=null){
                preorder(x.rightChild);
            }
        }

        static void inorder(Node x){
            if(x.leftChild!=null){
                inorder(x.leftChild);
            }
            sb.append(" "+x.nodeNumber);
            if(x.rightChild!=null){
                inorder(x.rightChild);
            }
        }

        static void postorder(Node x){
            if(x.leftChild!=null){
                postorder(x.leftChild);
            }
            if(x.rightChild!=null){
                postorder(x.rightChild);
            }
            sb.append(" "+x.nodeNumber);
        }
    }
    
