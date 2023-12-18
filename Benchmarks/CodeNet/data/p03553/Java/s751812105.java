import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String args[]) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String s[]=br.readLine().split(" ");

        int n=Integer.parseInt(s[0]);
        int d[]=new int[n];

	int max=0;

	ArrayList<Integer> nlist=new ArrayList<Integer>();

	s=br.readLine().split(" ");

	for(int i=0;i<n;i++){
	    d[i]=Integer.parseInt(s[i]);
	    max+=d[i];
	    nlist.add(i+1);
	}
	ArrayList<ArrayList<Integer>> nnlist=getSubsets(nlist,0);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>(new HashSet<>(nnlist));
	
	for(int i=0;i<list.size();i++){
	    int sum=0;
	    int dd[]=new int[n];
	    for(int j=0;j<n;j++){
		dd[j]=d[j];
	    }
	    for(int j=0;j<list.get(i).size();j++){
		for(int k=0;k<n;k++){
		    if((k+1)%list.get(i).get(j)==0){
			dd[k]=0;
		    }
		}
	    }
	    for(int k=0;k<n;k++){
		sum+=dd[k];
	    }
	    max=Math.max(max,sum);
	}
	if(max<0)
	    max=0;
	System.out.println(max);
	
    }

    static  ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set, int index){
	ArrayList<ArrayList<Integer>> allSubsets;
	
	if(set.size() == index){
	    allSubsets = new ArrayList<ArrayList<Integer>>();
	    allSubsets.add(new ArrayList<Integer>());	//空集合追加
	}else{
	    allSubsets = getSubsets(set, index+1);
	    int item = set.get(index);
	    ArrayList<ArrayList<Integer>> moreSubset = new ArrayList<ArrayList<Integer>>();
	    for (ArrayList<Integer> subset : allSubsets) {
		ArrayList<Integer> newSubset = new ArrayList<Integer>();
		newSubset.addAll(subset);	//いままでの全部いれたのと
		if(isPrimeNumber(item))
		    newSubset.add(item);		//新しい数字をたして
		moreSubset.add(newSubset);	//新しいArrayListを作ってmoreにいれる！
	    }
	    allSubsets.addAll(moreSubset);
	}
	return allSubsets;
    }

    private static boolean isPrimeNumber( int num ){
	if ( 1 >= num ) return false;
	if ( 2 == num ) return true;
	int n = (int)Math.sqrt( num );
	for ( int i = 2; i <= n; ++ i ) {
	    if ( 0 == ( num % i ) ) return false;
	}
	return true;
    }
    
    public static void permutation(String q, String ans){
        // Base Case
        if(q.length() <= 1) {
	    //   comb.add(ans + q);
        }
        // General Case
        else {
            for (int i = 0; i < q.length(); i++) {
                permutation(q.substring(0, i) + q.substring(i + 1),
                        ans + q.charAt(i));
            }
        }
    }
}
