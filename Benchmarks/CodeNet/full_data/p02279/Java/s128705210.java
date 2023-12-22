

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n  = Integer.parseInt(br.readLine());
		
		Node[] node = new Node[n];
		
		for(int i=0;i<n;i++)
		{
			//先 new n个节点 都为根节点
			node[i] = new Node(-1);
		}
		
		for(int i=0;i<n;i++)
		{
			String[] str = br.readLine().split(" ");
			int id = Integer.parseInt(str[0]); //
			int k = Integer.parseInt(str[1]); //k个节点
			
			for(int j=0;j<k;j++)
			{
				int c = Integer.parseInt(str[j+2]);
				//添加子节点
				node[id].add(c);
				//若是-1就是根节点，其他
				node[c].parent=id;
			}
						
		}
		
		
		
		//输出
		for(int i=0;i<n;i++)
		{
			System.out.println("node "+i+": parent = "+node[i].parent+", depth = "+node[i].getDepth(node)+", "+node[i].isType()+", "+node[i].child);
		}
 		
	}
}



// 节点类
class Node{

    int parent;
    //有字节点
    ArrayList<Integer> child=new ArrayList<>();
    
    //构造方法 有参
    public Node(int parent)
    {
    	this.parent=parent;
    }
    
    //添加子节点
    public void add(int id)
    {
    	child.add(id);
    }
    
    //判断是什么类型的节点
    //1 根节点 ， parent=-1
    //2 叶节点，没有子节点
    //3 ohter internal 节点
    public String isType()
    {
    	if(parent==-1)
    	{
    		return "root";
    	}
    	else if(child.size()==0)
    	{
    		return "leaf";
    	}
    	else
    	{
    		return "internal node";
    	}
    }
    
    //获取深度，就是根节点到节点的路径长度
    public int getDepth(Node node[])
    {
    	//构造的时候，输入的参数 parent
    	int pID=parent;
    	int count=0;
    	while(pID!=-1)
    	{
    		//只要不是根节点，就递归获取父节点，计数+1
    		pID=node[pID].parent;
    		count++;
    	}
    	//返回深度
    	return count;
    }
}
