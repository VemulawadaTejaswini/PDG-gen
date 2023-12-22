import java.util.*;
class Main{
  public static void main(String[] args){
Scanner in = new Scanner(System.in);
	        long n = in.nextLong();
	        long sum = 0;
	        long i = 0;
	        HashMap<Long , Long> map = new HashMap<>();
	        for(i = 0; i < n ; i++){
	            long ai = in.nextLong();
	            if(map.containsKey(ai)) {
	                Long f = map.get(ai);
	                map.remove(ai);
	                map.put(ai , f+1);
	            } else {
	                Long one = new Long(1);
	                map.put(ai , one);
	            }
	            sum = sum + ai;
	        }
	        long q = in.nextInt();
	        for(i = 0 ; i < q; i++){
	            long prev = in.nextLong();
	            long fill = in.nextLong();
	            if(map.containsKey(prev)){
	                long f = map.get(prev);
	                sum = sum - prev*f;
	                sum = sum + fill*f;
	                map.remove(prev);
	                if(map.containsKey(fill)){
	                    f += map.get(fill);
	                    map.remove(fill);
	                }
	                map.put(prev,f);
	            }
	            System.out.println(sum);
	        }
  }
    
  }
