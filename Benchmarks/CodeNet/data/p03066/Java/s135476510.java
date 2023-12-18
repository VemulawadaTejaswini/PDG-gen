
     
    import java.util.*;
    import java.lang.*;
    import java.io.*;
     
   
   public class Main
    {
    	public static void main (String[] args) throws java.lang.Exception
    	{
    	 Scanner s = new Scanner(System.in);
       int len = s.nextInt();
       int target = s.nextInt();
       List<Integer> l = new ArrayList<Integer>();
       List<List<Integer>> result = new ArrayList<>();
       getSeq(l,result,len,target,0,0);
       System.out.print(result.size());
     }
      static void getSeq(List<Integer> l, List<List<Integer>> result, int len, int target, int sum, int srtlen){
     
     int revsum =0;
        if(srtlen > len){
        	return;
        }
     
        if(sum==target){
         return; 
        }
     
     for(int j=l.size()-1; j>=0; j--){
     	revsum = revsum + l.get(j);
     	if(revsum == target){
     		return;
     	}
     }
        if(srtlen ==len){
         
          result.add(new ArrayList<>(l));
          return;
          
        }
     
        for(int i=0; i<=2; i++){
          l.add(i);
          getSeq(l,result,len,target, i+sum,srtlen + 1);
          l.remove(l.size()-1);
        }
     
      }
    }