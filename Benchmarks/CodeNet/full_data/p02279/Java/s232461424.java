import java.io.*;
import java.util.StringTokenizer;

class Main{

static final PrintWriter out = new PrintWriter(System.out);
static boolean[] hasParent;

static class Node{
    int id;
    int p;
    int rank;
    int k;
    int[] c;
    String type;
    Node(int id){
	this.id=id; this.p=-1; this.rank=-1; this.type="internal node";
    }
}
    
    public static void main(String[] args) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int num=Integer.parseInt(br.readLine());
	Node[] ns=new Node[num];
	hasParent=new boolean[num];
	StringTokenizer st;
	StringBuilder sb;
	for(int i=0;i<num;i++){
	    ns[i]=new Node(i);
	}
	for(int i=0;i<num;i++){
	    st=new StringTokenizer(br.readLine());
	    int id=Integer.parseInt(st.nextToken());
	    Node n=ns[id];
	    int k=Integer.parseInt(st.nextToken());
	    n.k=k;
	    if(k==0) n.type="leaf";
	    else{
		n.c=new int[k];
		for(int j=0;j<k;j++){
		    int c=Integer.parseInt(st.nextToken());
		    n.c[j]=c;
		    ns[c].p=id;
		    hasParent[c]=true;
		}
	    }
	}
	for(int i=0;i<num;i++){
	    if(ns[i].rank<0) ns[i].rank=setRank(i,ns);
	}
	for(int i=0;i<num;i++){
	    Node an=ns[i];
	    sb=new StringBuilder();
	    sb.append("node ");
	    sb.append(i);
	    sb.append(": parent = ");
	    sb.append(an.p);
	    sb.append(", depth = ");
	    sb.append(an.rank);
	    sb.append(", ");
	    sb.append(an.type);
	    sb.append(", [");
	    if(an.k!=0){
		for(int j=0;j<an.k;j++) sb.append((j==an.k-1)?an.c[j]:an.c[j]+", ");
	    }
	    sb.append("]");
	    sb.append(System.getProperty("line.separator"));
	    out.print(sb);
	}
	out.flush();
    }
    
    private static int setRank(int now,Node[] ns){
	if(ns[now].rank>=0) return ns[now].rank;
	if(!hasParent[now]){
	    ns[now].type="root";
	    return ns[now].rank=0;
	}
	return ns[now].rank=setRank(ns[now].p,ns)+1;
    }
}

