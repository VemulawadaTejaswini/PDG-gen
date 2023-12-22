/**
 * Created by huzhejie on 2016/10/11.
 */
import java.util.*;
import java.util.List;

/**
 * A* for 8 puzzle
 * f(x) = h(x) +step(g(x))
 * @author huzhejie
 *
 */

public class Main {

    public static void main(String args[])
    {
        int[][] startState=new int[3][3];
        /*
        read the data and build the startState two-dimentional array
         */
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String s;
        while(count<3){
            s = sc.nextLine();
            startState[count][0] = Integer.parseInt(s.split(" ")[0]);
            startState[count][1] = Integer.parseInt(s.split(" ")[1]);
            startState[count][2] = Integer.parseInt(s.split(" ")[2]);
            count++;
        }
        Astar test = new Astar(startState);
        test.run();
    }

}
class Astar
{
    /*
    store the start state
     */
    public int[][] startState;

    /*
    end state
     */
    public int[][] endState = {{1,2,3},{4,5,6},{7,8,0}};

    /*
    node comparator
     */
    public NodeOpenListComparator nodeOpenListComparator = new NodeOpenListComparator();

    /*
    a open list that stores the states that have not been checked
     */
    public PriorityQueue<Node> open = new PriorityQueue<Node> (1000, nodeOpenListComparator);

    /*
    a close list that stores two-dimentional arrays that have been checked
     */
    public Set<int[][]>  close =new HashSet<int[][]>();


    public Astar(int[][] startState)
    {
        this.startState = new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                this.startState[i][j] = startState[i][j];
            }
        }
    }

    /**
     * initialize A* with giving values to the start node(start state)
     */

    private void initStart()
    {
        Node startNode = new Node(startState);
        startNode.gvalue = 0;
        startNode.parent = null;
        startNode.hvalue = startNode.getHvalue();
        open.add(startNode);
    }

    /**
     * check if the node(state) has been checked before
     * @param lNode
     * @param newNodeParent
     * @return
     */
    private boolean isInList(Node lNode,Node newNodeParent)
    {
        if(newNodeParent != null&&lNode.equal(newNodeParent.state))
        {
            return true;
        }
        else
            return false;
    }

    /**
     * initialize the child nodes of the new nodes by moving in four diffirent directions
     * @param newNode
     * @param newNodeChild
     */
    private void initChild(Node newNode,List<Node> newNodeChild)
    {

        /*
        zeroPosition is from 0 to 8.
        e.g. if it is 2,then the position of blank block is (3,1)(third column,first row)
         */
        int zeroPosition;
        zeroPosition = newNode.getBlankPosition();

        /*
        check if the blank block can be moved leftwards
         */
        if((zeroPosition%3) !=2)
        {
            Node lNode = new Node(newNode.state);
            lNode.state[zeroPosition/3][zeroPosition%3] = lNode.state[zeroPosition/3][(zeroPosition%3)+1];
            lNode.state[zeroPosition/3][(zeroPosition%3)+1] = 0;
            if(!(isInList(lNode,newNode.parent))) {
                lNode.parent = newNode;
                lNode.gvalue = newNode.gvalue + 1;
                lNode.hvalue = lNode.getHvalue();
                newNodeChild.add(lNode);
            }
        }

        /*
        check if the blank block can be moved rightwards
         */
        if((zeroPosition%3) !=0)
        {
            Node lNode = new Node(newNode.state);
            lNode.state[zeroPosition/3][zeroPosition%3] = lNode.state[zeroPosition/3][(zeroPosition%3)-1];
            lNode.state[zeroPosition/3][(zeroPosition%3)-1] = 0;

            if(!(isInList(lNode,newNode.parent))) {
                lNode.parent = newNode;
                lNode.gvalue = newNode.gvalue + 1;
                lNode.hvalue = lNode.getHvalue();
                newNodeChild.add(lNode);
            }

        }

        /*
        check if the blank block can be moved downwards
         */
        if((zeroPosition/3) !=2)
        {
            Node lNode = new Node(newNode.state);
            lNode.state[zeroPosition/3][zeroPosition%3] = lNode.state[zeroPosition/3+1][zeroPosition%3];
            lNode.state[zeroPosition/3+1][zeroPosition%3] = 0;
            if(!(isInList(lNode,newNode.parent))) {
                lNode.parent = newNode;
                lNode.gvalue = newNode.gvalue + 1;
                lNode.hvalue = lNode.getHvalue();
                newNodeChild.add(lNode);
            }
        }

        /*
        check if the blank block can be moved upwards
         */
        if((zeroPosition/3) !=0)
        {
            Node lNode = new Node(newNode.state);
            lNode.state[zeroPosition/3][zeroPosition%3] = lNode.state[zeroPosition/3-1][zeroPosition%3];
            lNode.state[zeroPosition/3-1][zeroPosition%3] = 0;

            if(!(isInList(lNode,newNode.parent))) {
                lNode.parent = newNode;
                lNode.gvalue = newNode.gvalue + 1;
                lNode.hvalue = lNode.getHvalue();
                newNodeChild.add(lNode);
            }
        }
    }

    /**
     * update open list
     * @param NodeList  the child nodes list of the new node
     */
    private void updateOpenList(List<Node> NodeList){
        for(Node childNode:NodeList) {
            if (isInCloseList(childNode.state, close));
            else open.add(childNode);
        }
    }

    /**
     * check if the state is already checked
     * @param state  the state that is to be checked
     * @param closeList close list
     * @return
     */
    private boolean isInCloseList(int[][] state, Set<int[][]> closeList)
    {
        if(closeList.contains(state)){
            return true;
        }
        else
            return false;
    }

    /**
     *  the main execution part of the A* algorithm
     */
    public void run()
    {
        initStart();
        while(!open.isEmpty()) {
            Node newNode = open.poll();
            close.add(newNode.state);
            if (newNode.equal(endState)) {
                int step = 0;
                while (newNode.parent!=null) {
                    newNode = newNode.parent;
                    step += 1;
                }
                System.out.println(step);
                break;
            }
            List<Node> newNodeChild =new ArrayList<Node>();
            initChild(newNode,newNodeChild);
            updateOpenList(newNodeChild);
        }
    }
}

/**
 * node comparator
 */
@SuppressWarnings("unchencked")
class NodeOpenListComparator implements Comparator<Node>{
    @Override
    public int compare(Node x, Node y) {
        return x.gvalue+x.hvalue - y.gvalue-y.hvalue;
    }
}


class Node
{
    /*
    the prarent node of this node
     */
    Node parent;

    /*
    state of the node
     */
    public int[][] state = new int[3][3];

    /*
    the value of g(x)
     */
    int gvalue;

    /*
    the value of h(x)
     */
    int hvalue;


    public Node(int[][] state)
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                this.state[i][j] = state[i][j];
            }
        }
    }

    /**
     * get the position of the blank block
     * @return
     */
    public int getBlankPosition()
    {
        int k=0;
        for(int i=0;i<9;i++)
        {
            if(state[i/3][i%3] == 0)
            {
                k=i;
                return k;
            }
        }
        return k;
    }

    /**
     * check if the state is equal to the end state
     * @param endState
     * @return
     */
    public boolean equal(int[][] endState)
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(state[i][j]!= endState[i][j])
                {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * calculate the h(x) of the node
     * @return
     */
    public int getHvalue()
    {
        int sum=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(state[i][j]!=0)
                    sum+=Math.abs(i-(state[i][j]-1)/3)+Math.abs(j-(state[i][j]-1)%3);
            }
        }
        return sum;
    }

}