
import java.util.*;

class Main {
    Scanner sc = new Scanner(System.in);

    static class Tree{
    	Tree left;
    	Tree right;
    	Tree(){
    	}
    	Tree(String s){
    		int bc=0;
    		int i=0;
    		for(;i<s.length();i++){
    			if(s.charAt(i)=='(')bc++;
    			if(s.charAt(i)==')')bc--;
    			if(s.charAt(i)==',' && bc==1){
    				if(i>1){
    					left=new Tree(s.substring(1,i));
    				}
    				if(i+1<s.length()-1){
    					right=new Tree(s.substring(i+1,s.length()-1));
    				}
    				return;
    			}
    		}
    	}
    	public static Tree Intersect(Tree a,Tree b){
    		if(a!=null && b!=null){
    			Tree tree=new Tree();
    			if(a.left!=null && b.left!=null){
	    			tree.left=Intersect(a.left,b.left);
	    		}
	    		if(a.right!=null && b.right!=null){
	    			tree.right=Intersect(a.right,b.right);
	    		}
	    		return tree;
    		}
    		return null;
    	}
    	public static Tree Union(Tree a,Tree b){
    		if(a==null && b==null){
    			return null;
    		}
    		Tree tree=new Tree();
    		if((a!=null && a.left!=null) || (b!=null && b.left!=null)){
    			tree.left=Union(a!=null?a.left:null,b!=null?b.left:null);
    		}
    		if((a!=null && a.right!=null) || (b!=null && b.right!=null)){
    			tree.right=Union(a!=null?a.right:null,b!=null?b.right:null);
    		}
    		return tree;
    	}


    	public String toString(){
    		return "("+(left!=null?left:"")+","+(right!=null?right:"")+")";
    	}
    }

    public void run() {
        while(sc.hasNext()){
        	String key=sc.next(),a=sc.next(),b=sc.next();
        	Tree ta=new Tree(a);
        	Tree tb=new Tree(b);
        	if("i".equals(key)){
        		ln(Tree.Intersect(ta, tb));
        	}else if("u".equals(key)){
        		ln(Tree.Union(ta, tb));
        	}else{
        	}
        }
    }
    public static void main(String[] args) {
        new Main().run();
    }
    public static void pr(Object o) {
        System.out.print(o);
    }
    public static void ln(Object o) {
        System.out.println(o);
    }
    public static void ln() {
        System.out.println();
    }
}