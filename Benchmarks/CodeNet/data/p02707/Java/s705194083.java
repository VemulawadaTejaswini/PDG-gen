import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner in = new Scanner(System.in);
      	HashMap<Integer, Integer> hm = new HashMap<>();
	    int n = in.nextInt();
      	int ar[] = new int[n-1];
      	for(int i=0;i<n-1;i++){
          ar[i]=in.nextInt();
        }
     
      	for(int i:ar){
          if(!hm.containsKey(i))
            hm.put(i,1);
          else
            hm.put(i,hm.get(i)+1);
        }
        for(Map.Entry<Integer,Integer> me : hm.entrySet() ){
         	System.out.println(me.getValue()); 
        }
      	int rem= n-hm.size();
      	for(int i=0;i<rem;i++){
          System.out.println("0");
        
          
	}

}
