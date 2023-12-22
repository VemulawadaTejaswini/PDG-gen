import java.io.*;
import java.util.*;
 
public class Main {
	private static InputStreamReader isr;
	private static BufferedReader br;
	
	public static void main(String args[]){
		isr = new InputStreamReader(System.in);
		br = new BufferedReader(isr);
		
		System.out.println(Levenshtein( getstr(), getstr() ));
	}
	
	public static char[] getstr(){
	    String buf;
		try{
			buf = br.readLine();
		}catch(Exception e){
			buf = "";
		}
		buf=" "+buf;
		return buf.toCharArray();
	}
	
	public static int Levenshtein(char[] a, char[] b){
	    //int length=0;
	    int al=a.length, bl=b.length;
	    /*int[][] graph = new int[al][bl];
	    for(int i=0; i<al; i++){
	        for(int j=0; j<bl; j++){
	            if(a[i]==b[j]){
	                graph[i][j]=1;
	            }else{
	                graph[i][j]=0;
	            }
	        }
	    }*/
	    //System.out.println("ab "+al+" "+bl);
	    int[][] state = new int[al][bl];
	    /*for(int l=0; l<al+bl-1; l++){
	        //state[l-1][0]=state[l-1-1][0]+1;
	        int w;
	        if(l<al && l<bl){ w = l;System.out.println("a0 "+l+" "+w);
	        }else if(l<al && l>=bl){ w = bl;System.out.println("a1 "+l+" "+w);
	        }else if(l>=al && l<bl){ w = al;System.out.println("a2 "+l+" "+w);
	        }else if(l>=al && l>=bl){ w = al+bl-l;System.out.println("a3 "+l+" "+w);
	        }else{ w=0;
	        }
	        
	        for(int k=0; k<=w; k++){
	            if(l==0){
	                state[0][0]=0;
	                System.out.println("e "+state[l-k][k]);
	            }else if(k==0){
	                state[l][0]=state[l-1][0]+1;
	                System.out.println("u "+state[l-k][k]);
	            }else if(k==w){
	                state[0][l]=state[0][l-1]+1;
	                System.out.println("l "+state[l-k][k]);
	            }else{
	                state[l-k][k]=Math.min(Math.min(state[l-k][k-1],state[l-k-1][k]),state[l-k-1][k-1]-1)+1;
	                System.out.println("m "+state[l-k][k]);
	            }
	            
	            //length++;
	        }
	    }*/
	    int v=0, h=0;
	    state[v][h]=0;//System.out.println(v+" "+h+"  "+state[v][h]);
	    for(h=1; h<bl; h++){
	        state[v][h]=state[v][h-1]+1;//System.out.println(v+" "+h+"  "+state[v][h]);
	    }
	    for(v=1; v<al; v++){
	        h=0;
	        state[v][h]=state[v-1][h]+1;//System.out.println(v+" "+h+"  "+state[v][h]);
	        for(h=1; h<bl; h++){
	            if(a[v]==b[h]){
	                state[v][h]=Math.min(Math.min(state[v-1][h],state[v][h-1]),state[v-1][h-1]-1)+1;//System.out.println(v+" "+h+"  "+state[v][h]);
	            }else{
	                state[v][h]=Math.min(state[v-1][h],state[v][h-1])+1;//System.out.println(v+" "+h+"  "+state[v][h]);
	            }
	            
	        }
	    }
	    /*for(int i=0; i<state.length; i++){
	        OuAr(state[i]);
	    }*/
	    
	    //return length;
	    return state[al-1][bl-1];
	}
	
	/*public static void OuAr(int[] a){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ,");
        }
        System.out.println("");
    }*/
	
}