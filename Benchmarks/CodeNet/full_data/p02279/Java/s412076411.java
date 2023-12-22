import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {

	static long changecount = 0;
   public static void main(String args[]) throws IOException{

	   Scanner sc = new Scanner(System.in);
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int n = Integer.parseInt( br.readLine()  );


       Tree tree = new Tree(n);


	   for(int i = 0;i < n; i++){
		   String[] string = br.readLine().split(" ");
		   tree.Nodes[ Integer.parseInt(string[0]) ].input_nood_number( Integer.parseInt(string[0]) );
		  // System.out.println("check1 " +i);
           tree.Nodes[ Integer.parseInt(string[0]) ].input_root_sum(Integer.parseInt(string[1] ));
           //System.out.println("check2");
           tree.Nodes[ Integer.parseInt(string[0]) ].input_root_number(string , tree , Integer.parseInt(string[0]));
           //System.out.println("check3");
	   }


        tree.printtree();










	   //System.out.println("");
	   sc.close();
   }






}

class Node{

    int nood_number = 0;
    int root_sum = 0;
    int parent_number = -1;
    int[] root_number = null;



    void input_nood_number(int date){
    	nood_number = date;
    }

    void input_root_sum(int date){
    	root_sum = date;
    	if( date > 0 ){
    		root_number = new int[date];
    	}

    }

    void input_parent_number(int number){
    	parent_number = number;
    }

    void input_root_number(String[] numbers , Tree tree, int parentnumber){
          for(int i = 0; i < root_sum;i++){
              root_number[i] = Integer.parseInt(numbers[2 + i] );
              tree.Nodes[ Integer.parseInt(numbers[2 + i] ) ].parent_number = parentnumber;
          }
    }

    String print_root(){

    	StringBuilder sb = new StringBuilder();


    	for(int i = 0; i < root_sum; i++){

    		sb.append(root_number[i]);

    		if(i < root_sum - 1){
    			sb.append(", ");
    		}


    	}

    	return new String(sb);
    }


    String node_type(){

    	String type = "node";

        if( root_number == null && parent_number != -1){
        	 type = "leaf";
        }
        else if(root_number != null && parent_number != -1){
        	 type = "internal node";
        }
        else if(root_number != null && parent_number == -1){
       	 type = "root";
       }

    	return type;
    }


     int node_depth(Node[] nodes , int number){
	     int depth = 0;

         for(; nodes[number].parent_number != -1; depth++){
        	 //System.out.println(nodes[number].parent_number);
        	 number = nodes[number].parent_number;

         }

	     return depth;
    }

}

//Integer.parseInt(string[2+i])

class Tree{

	Node[] Nodes = null;
    int allnode_num = 0 ;

    Tree(int n){
    	allnode_num = n;
    	Nodes = new Node[n];
    	for(int i = 0; i < n ; i++){
    		Nodes[i] = new Node();
    	}

    }


   void printtree(){

	   for(int i = 0; i < allnode_num ; i++){
		   //System.out.print("nood_number="+Nodes[i].nood_number+" root_sum="+Nodes[i].root_sum+" parent_number="+Nodes[i].parent_number);
		   //System.out.println(Nodes[i].node_depth(Nodes, i));
		   System.out.println("node "+i+": parent = "+Nodes[i].parent_number+", depth = "+ Nodes[i].node_depth(Nodes, i)+", " +Nodes[i].node_type() +", ["+Nodes[i].print_root()+"]" );


   	   }

   }

}