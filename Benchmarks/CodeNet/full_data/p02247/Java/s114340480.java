

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

//What's next?
/*
 * Having manually tested it with multiple strings, it seems to work fine!
 * If you're confident, move on to making the "convert to true suffix tree part".
 * Then we can move on to applications such as substring search problems,
 * and conduct further, automated tests based on the solutions to those problems.
 * 
 * Also, you could clean up some of the unneeded debug messages...
 *  Last updated: 2020/03/02
 * 
 * 
 * 
 * 
 */

public class Main 
{
	static Node root;
	
	//for debugging
	static boolean debug = false;
	
	static int LETTERS = 62; //0-25 for a to z, 26 for $.
	static int computation = 0;
	
	static class SuffixTree
	{
		Node root = null;
		String s;
		int nodes = 0;
		int currentEnd = 0;
		
		void findSubstring(String p)
		{
			ArrayList<Integer> l = new ArrayList<>();
			Node posNode = root;
			Edge posEdge = null;
			int posLength = 0;
			
			int i = 0;

			while(i < p.length())
			{
				//from node, go to edge!
				posEdge = posNode.getEdgeOfChar(p.charAt(i));
				posLength = 0;
				//traverse that edge!
				
				if(posEdge == null)
					return;
				
				while(posEdge != null && posLength < posEdge.getLength())
				{
//					System.out.println("i = " + i + ". Currently on " + posNode + " " + posEdge.s + " " + posLength);
//					System.out.println("Next char is " + (s.charAt(posEdge.s + posLength)));
					//compare next char
					if(s.charAt(posEdge.s + posLength) == p.charAt(i))
					{
						i++;
						posLength++;
						if(i >= p.length())break;
					}
					else
					{ //mismatch!
//						System.out.println("");
						return;
					}
				}
				if(posLength == posEdge.getLength()) //reached end of edge
				{
					if(posEdge.node != null)
					{
						posNode = posEdge.node;
						posLength = 0;
					}
				}
			}
			
			if(debug)System.out.println("Landed on " + posNode + " " + posEdge.s + " " + posLength);
			
			Stack<Edge> stack = new Stack<>();
			if(posLength == 0)
			{
				for(int cc = 0; cc < LETTERS+1; cc++)
				{ //if edge is not leaf, it ends in a node. add all edges going out from that node to stack.
					if(posNode.edge[cc] != null)
						stack.add(posNode.edge[cc]);
				}
			}
			else stack.add(posEdge);
			
			while(!stack.isEmpty())
			{ 
				Edge e = stack.pop();
				if(e.node == null) //if edge is leaf, print out
					l.add(e.getStartChar());
				else
				{
					for(int cc = 0; cc < LETTERS+1; cc++)
					{ //if edge is not leaf, it ends in a node. add all edges going out from that node to stack.
						if(e.node.edge[cc] != null)
							stack.add(e.node.edge[cc]);
					}
				}
			}
			l.sort(null);
			for(int z = 0; z < l.size(); z++)
				System.out.println(l.get(z));
		}
		
		void findLeavesFrom(Node node, Edge edge, int posLength)
		{

		}
		
		public SuffixTree(String s0)
		{
			s = s0;
			root = new Node(this);
			
			Node posNode = root;
			int posEdge = -1;
			int posLength = 0; //length from cur node
			
			s = s + "$";
			
			int j = 0; //starting character of the suffix to add in extension (0 <= j <= i)
			for(int i = 0; i < s.length(); i++)
			{ //pos is currently the position of S[j-1...i]
//				if(i%100000 == 0)System.out.println("CUR" + i);
				if(debug)
					System.out.println("\n[PHASE START!!!] i = " + i + ", '" + s.charAt(i) + "'");
				Node linkFrom = null; //new node on previous extension. if one wasn't created, null.
				//implicit extensions from 1 ~ ji.
				currentEnd = i;
				
				//SEA algorithm.
				int extension = 1;
				
//				int gammaLength = 0; //how far starting from this edge, is the point gamma starts? (the other point being the node)
//				Edge gammaEdge = null;
				
				int gammas = 0; //path to travel in extensions j >= 2
				int gammae = 0;
				
				boolean usedSuffixLink = false;
				
				while(j <= i)
				{
					computation++;
					boolean rule3 = false;
					if(debug)
					{
						System.out.println("\n Gonna do extension! j = " + j + "\nposNode " + posNode);
						System.out.println("posEdge " + posEdge);
						System.out.println("posLength " + posLength);
					}
					if(extension == 1)
					{ //no need to traverse gamma
						//do nothing.
					}
					else
					{ 
						{ //traverse gamma.
							int gammaLen = gammae - gammas + 1;
							int remDis = gammae - gammas + 1;
							int traveledDis = gammaLen - remDis;
							if(debug)
							{
								System.out.println("Traverse gamma... [!!!!!!!!!!!] Gamma length = " + gammaLen);
								System.out.println("Gamma: " + gammas + " " + gammae);
							}
							
							Edge realEdge = null;
							int remEdgeLen = 0;
							
							if(!usedSuffixLink)
								posEdge = gammas;
							
							while(remDis > 0)
							{
								if(gammaLen > 0)
								{
									realEdge = posNode.getEdgeOfChar(s.charAt(posEdge));//posEdge));
									if(realEdge!=null)remEdgeLen = realEdge.getEnd() - (posLength+realEdge.s)+1; //how many more letters in this edge that we walk on?
								}
								
								if(remDis < remEdgeLen)
								{ //we wound up in the middle of the edge!
									posLength += remDis;//new: update poslength!
									remDis = 0;
									if(debug)System.out.println("We landed in the middle of the edge!");
									
								}
								else if(remDis >= remEdgeLen)
								{ //we wound up right on the node, or crossed it!
									remDis -= remEdgeLen;
									
									//change node & edge accordingly...
									posNode = realEdge.node;
									traveledDis = gammaLen - remDis;
									posEdge = gammas + traveledDis;
									//posLength = remDis; //but what if we crossed a node again?
									posLength = 0; //let's just go to this node, then continue the while loop.
									//NEW: max pos 
									
									if(debug)
									{
										if(remDis == 0)
											System.out.println("Landed right on node " + posNode.id + "!");
										else
											System.out.println("Crossed node " + posNode.id + "! Going out on some edge that goes out from this node...");
//										System.out.println("Edge is now " + s.charAt(posEdge) + "!");
										System.out.println("     remEdgeLen " + remEdgeLen + ", remdis " + remDis + " posEdge " + posEdge + ", gammas " + gammas + ", traveled " + traveledDis);
										System.out.println("     posLength " + posLength);
									}
									
									assert(posNode.getEdgeOfChar(s.charAt(posEdge)) != null) : "We're travelling gamma down again but edge is not found!";
								}
							}
						}
					}
					
					//execute extension rules, now that we're here
					{
						Edge realEdge;
						if(posEdge == -1)realEdge = null;
						else realEdge = posNode.getEdgeOfChar(s.charAt(posEdge));
						
						if(realEdge != null && debug)System.out.println("posEdge " + posEdge + " realEdge length " + realEdge.getLength());
						
						if(posLength == 0) //we landed on a node
						{ //posNode doesn't have edge for this char, meaning...
							//does the node already have this char?
							if(posNode.edge[chartoint(s.charAt(i))] == null)
							{
								if(debug)
								{
									System.out.println("Since we land in a node that doesn't already has " + s.charAt(i) + "...");
									System.out.println("Rule 2 extension!");
								}
								posNode.edge[chartoint(s.charAt(i))] = new Edge(this, i, -1, posNode.chardepth);
								if(debug)System.out.println("Created new edge for node " + posNode + " that starts with " + s.charAt(i));
							}
							else
							{
								if(debug)
								{
									System.out.println("Since we land in a node that already has " + s.charAt(i) + "...");
									System.out.println("Node rule 3 extension!");
								}
								rule3=true;
							}
							
							//either way, if a node was created on previous extension, its suffix link should lead to this node
							if(linkFrom != null)
							{
								linkFrom.suffixLink = posNode;
								if(debug)System.out.println("Suffix link from " + linkFrom + " to " + linkFrom.suffixLink);
								linkFrom = null; //we don't create a new node on this extension.
							}
						}
						else if(posLength == realEdge.getLength() && realEdge.node == null)
						{ //RULE 1 EXTENSION! (Landed on a leaf)
							//We probably don't actually need to do anything since the pointer is to 'e' anyway.
							if(debug)System.out.println("Rule 1 extension!");
							assert(1==0); //this shouldn't be happening.
							linkFrom = null; //we don't create a new node on this extension.
						}
						else if(posLength < realEdge.getLength())
						{ //We land in the middle of the edge 
							
							if(s.charAt(realEdge.s + posLength) == s.charAt(i))
							{ //...which continues with this char: Rule 3!
								
								if(debug)System.out.println("Rule 3 extension in the midst of edge!");
								rule3=true;
								assert(linkFrom == null); //if we made a node in prev. extension, we should've landed right on node, or create a new node
								linkFrom = null; //we don't create a new node on this extension.
							}
							else
							{
								//(and there shouldn't exist a path with this char)
								if(debug)
								{
									System.out.println("Since the path continues with " + s.charAt(realEdge.s + posLength) + ", not " + s.charAt(i) + "...");
		//							System.out.println("Path: " + (realEdge.s) + " " + realEdge.e);
									System.out.println("Poslength " + posLength);
									System.out.println("Old path: " + realEdge.s + " " + realEdge.getEnd());
									System.out.println("Rest in path: " + s.substring(realEdge.s+posLength, realEdge.getEnd()+1));
		
									System.out.println("Rule 2 extension!");
								}
								
								
//								System.out.println("TEMPE " + realEdge.getEnd());
								//before we do anything, store the node the realEdge currently ends at
								Node tempn = realEdge.node;
								//first, make a node, then split the realEdge, then add new edge to the node.
								//make node
								realEdge.node = new Node(this);
								realEdge.node.chardepth = posNode.chardepth + posLength;
								if(debug)System.out.println("New node created: " + realEdge.node + ", charDepth " + realEdge.node.chardepth);
								
								//split realEdge
								int tempe = realEdge.e;
								int splitSecondStart = realEdge.s + posLength; //head of 2nd edge is to be the character of original edge that didn't match
								//(this is the second half of the original edge)
								realEdge.e = realEdge.s + posLength-1; //length to be set as number of matched character
								//^this is the end of the old, shrunken edge!

								//old outgoing (second half of split edge)
								realEdge.node.edge[chartoint(s.charAt(splitSecondStart))] = new Edge(this, splitSecondStart, tempe, realEdge.node.chardepth, tempn);
								
								
								//add new edge for our new character
								realEdge.node.edge[chartoint(s.charAt(i))] = new Edge(this, i, -1, realEdge.node.chardepth);
								if(debug)System.out.println("Edges leading out from this new node: " + s.charAt(splitSecondStart) + " and " + s.charAt(i));
								
								if(debug)System.out.println("The shortened edge becomes " + realEdge.s + " " + realEdge.e);
								
								//We don't change our current node to this new node, however,
								//since we wouldn't be able to use a suffix link from this node on the next extension.
//								System.out.println("Current node right now is " + posNode);
								
//								System.out.println("LINKFROM " + linkFrom);
								if(linkFrom != null)
								{
									linkFrom.suffixLink = realEdge.node;
									if(debug)System.out.println("Suffix link from " + linkFrom + " to " + linkFrom.suffixLink);
								}						
								linkFrom = realEdge.node;
//								System.out.println("linkFrom is now " + linkFrom);
							}
						}
						//exceptions
						else 
						{
							System.out.println("MYSTERY EXCEPTIONNE!");
							assert(0==1);
						}
					}
					
					if(!rule3)j++; //Increment j???? Because not rule 3...
					
					
					extension++;
					if(rule3)
					{ //prepare for next PHASE. That is, mark the place. (?) (Go one step onwards, so that we actually start here next.)
//						posEdge++;
						if(posLength == 0) //in case we ended up right on a node, in order to step onwards we step towards
							//the direction of the last letter, that is, the letter added in this phase (i)
							posEdge = posNode.getEdgeOfChar(s.charAt(i)).s;
						
						posLength++;
						
						
						Edge realEdge = null;
						if(posEdge != -1)realEdge = posNode.getEdgeOfChar(s.charAt(posEdge));
						assert(realEdge!=null); //since we've stepped towards the direction of i... that direction should exist
						//the edge doesnt necessarily start with i, i could just be some letter in the middle of it.
//						System.out.println("Potential Node " + realEdge.node);
						if(debug)System.out.println("Do we change node? " + posNode + ", edge length " + realEdge.getLength() + ", posLength " + posLength + ", posEdge " + posEdge);
						
						if(realEdge != null && posLength >= (realEdge.getLength()) //GETLENGTH
								&& realEdge.node != null)
						{ //if we reach or crossed the end of the edge AND it's not a leaf, change node!
							if(debug)System.out.println("Changed node! Now " + realEdge.node);
							posNode = realEdge.node;
							posEdge = -1;
							posLength = 0;
						}
						break;
					}
					
					if(j > i)break;
					
					if(debug)System.out.println("\nPreparing next extension!\n");
//					System.out.println("posNode = " + posNode);
//					System.out.println("posEdge = " + posEdge);
//					System.out.println("posLength = " + posLength);
					
					//extension j>=2
					if(posNode == root)
					{ //if root, go to S[j...i] as in naive method.
						if(debug)System.out.println("Since posNode is root...");
						if(debug)System.out.println("Also, posNode " + posNode + " posEdge " + posEdge + " posLength " + posLength);
						
						//Since S[j...i] is S[j-1...i] but with first char cut off, we can just do as follows:
//						posEdge++; //the edge now should be the one that starts from the next letter in S.
//						posLength--; //S[j-1...i] has one less letter than S[j...i], so one less letter in its length.
						
						//TEST:
						
						usedSuffixLink = false;
						
//						System.out.println("DEBUG: " + Arrays.toString(posNode.edge));

						
						if(posLength <= 1)
						{ //pos length <= 1 means you won't need to traverse anywhere from root!
							gammas = 0;
							gammae = -1;
						}
						else
						{
							if(posNode.edge[chartoint(s.charAt(posEdge))] != null)
							{
								gammas = posNode.edge[chartoint(s.charAt(posEdge))].s+1; //plus one because we're cutting off the 1st char
								gammae = gammas + posLength - 1 - 1; //SHOULD BE 2. FIX
								if(debug)System.out.println("Setting gammas... " + gammas + " " + gammae);
							}
						}
						posLength = 0;
					}
					else
					{ //use suffix link (LINK THEM TOO...)
						
						//"Walk up". In reality, the "up" node is already known; posNode.
//						gammaLength = posLength;
//						gammaEdge = posNode.edge[chartoint(s.charAt(posEdge))];
						
						if(posLength <= 0)
						{ //pos length <= 0 means gamma is empty!
							gammas = 0;
							gammae = -1;
						}
						else
						{
							gammas = posNode.edge[chartoint(s.charAt(posEdge))].s;
							gammae = gammas + posLength - 1;
						}
						
						posLength = 0; //posLength becomes 0 because we need to walk down again
						
						if(debug)System.out.println("Traverse suffix link from " + posNode + " to " + posNode.suffixLink);
						posNode = posNode.suffixLink;
						//then traverse path γ (next iteration)
						//posEdge doesn't change since it's the same edge letter, just from a different node.
						//gammaLength = posLength itsef, since the overall path is shortened by 1 but that's already
						//reflected by the fact that the current node is closer to the root.
						usedSuffixLink = true;
					}
				}
			}	
			
			//leaves
		}
	}
	
	static class Node
	{
		Edge[] edge = new Edge[LETTERS+1]; //26 for $
		Node suffixLink = null;
		SuffixTree suffixTree;
		int chardepth = 0;
		
		//for debugging
		int id;
		
		public Node(SuffixTree suffixTree0)
		{
			suffixTree = suffixTree0;
			id = suffixTree.nodes;
			suffixTree.nodes++;
			suffixLink = suffixTree.root;
//			System.out.println("Node " + id + " created " + ", " + nodes);
		}
		
		Edge getEdgeOfChar(char c)
		{ //returns the edge that starts with character c
			return edge[chartoint(c)];
		}
		
		public String toString()
		{
			return "NODE " + id;
		}
	}
	
	static class Edge
	{
		int s = -2;
		int e = -2; //-1 means 'end'
		Node node = null; //null means this edge leads to leaf
		//this is the node that you will reach by traversing the edge (destination node)
		SuffixTree suffixTree;
		int startCharDepth = 0; //the node which has this as an outgoing edge (source node)'s char depth.
		//(length of path from the root to that node)
		
		int getEnd()
		{
			if(e == -1)return suffixTree.currentEnd;
			else return e;
		}
		
		int getLength()
		{
			return getEnd() - s + 1;
		}
		
		
		boolean getIsLeaf() {return node==null;}
		
		int getStartChar()
		{
			int len = startCharDepth + (getEnd()-s+1); //length of the suffix path to end of this edge
//			System.out.println("Len is " + len + ", since SCD is " + startCharDepth + ", s " + s + " e " + e);
			return suffixTree.s.length() - len;
		}
		
		String getLeafSuffix()
		{ //Returns the suffix represented by this leaf edge.
			if(getIsLeaf())
				return suffixTree.s.substring(getStartChar(), startCharDepth + (getEnd()-s+1));
			else return "";
		}
		
		public Edge(SuffixTree sufTree, int s0, int e0, int startCharDepth)
		{
			this.startCharDepth = startCharDepth;
			suffixTree = sufTree;
			s = s0;
			e = e0;
		}
		
		public Edge(SuffixTree sufTree, int s0, int e0, int startCharDepth, Node n)
		{
			this.startCharDepth = startCharDepth;
			suffixTree = sufTree;
			s = s0;
			e = e0;
			node = n;
		}
	}
	
	static int chartoint(char c)
	{
		if(c >= 'a' && c <= 'z')return c-'a';
		else if(c >= 'A' && c <= 'Z')return c-'A'+26;
		else if(c >= '0' && c <= '9')return c-'0'+52;
		else if(c == '$')return LETTERS; else return c-'a';
	}
	
	public static void main(String[] args)
	{
		
		FastReader sc = new FastReader();
		
		debug = false;
		
		String st = sc.next();
		computation = 0;
		SuffixTree tree = new SuffixTree(st);
//		System.out.println("\n\n" + computation + " cycles for " + st.length());
		
//		while(true)
		{
			String p = sc.next();
			tree.findSubstring(p);
		}
	}
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 	

}

