import java.util.Scanner;

public class Main {
    static Node[] list;
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int m= Integer.parseInt(sc.next());
        String s;
        int reg=0;
        int flag=1;
        int reg2;
        StringBuilder str;
        StringBuilder str2;
        list=new Node[m];
        for(int i=0;i<m;i++) list[i] = new Node();
        
        for(int i=0;i<m;i++){
        	s=sc.next();
        	if(s.equals("insert")){
        		list[i].number=Integer.parseInt(sc.next());
        		if(flag==1){
        			reg=i;
        			list[reg].pid=-1;
        			flag=0;
        		}else{
        			insert(list[reg],list,i);
        		}
        	}else if(s.equals("print")){
        		str=new StringBuilder();
        		str2=new StringBuilder();
        		naka(list,list[reg],str);
        		mae(list,list[reg],str2);
            }else if(s.equals("find")){
            	reg2=sc.nextInt();
            	for(int j=0;j<i;j++){
            		if(list[j].number==reg2){
            			System.out.println("yes");
            			break;
            		}else if(j==i-1){
            			System.out.println("no");
            		}
            	}
            }
        }
    }
    static void insert(Node node,Node[] list,int i){
        if(list[i].number>node.number){
            if(node.right==null){
            	node.right=list[i];
            }else{
            	insert(node.right,list,i);
            }
        }else {
        	if(node.left==null){
        		node.left=list[i];
        	}else{
        		insert(node.left,list,i);
        	}
        }
    }
    static void mae(Node[] list, Node node,StringBuilder str){
    	str.append(" "+node.number);
    	if(node.left!=null){
    		mae(list,node.left,str);
    	}
    	if(node.right!=null){
    		mae(list,node.right,str);
    	}
    	if(node.pid==-1){
    		System.out.println(str);
    	}
    }
    static void naka(Node[] list, Node node,StringBuilder str){
    	if(node.left!=null){
    		naka(list,node.left,str);
    	}
    	str.append(" "+node.number);
    	if(node.right!=null){
    		naka(list,node.right,str);
    	}
    	if(node.pid==-1){
    		System.out.println(str);
    	}
    }
}

class Node{
	int number;
	Node left;
	Node right;
	int pid;
	Node(){
		pid=0;
		number=-1;
		left=null;
		right=null;
	}
}
