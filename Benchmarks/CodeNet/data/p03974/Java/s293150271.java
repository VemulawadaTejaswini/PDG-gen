import java.util.*;
public class Main {// Main
    public static void main(String[] args){
    	Scanner in = new Scanner(System.in);
    	int N = in.nextInt();
    	String[] inputs = new String[N];
    	for(int n=0; n<N; n++){
    		inputs[n] = in.next();
    	}
    	int Q = in.nextInt();
    	for(int q=0; q<Q; q++){
    		in.nextInt();
    		String query = in.next();
    		char[] dics = query.toCharArray();
    		Map<Integer, String> map = new HashMap<Integer, String>();
			for(int j=0; j<N; j++){
				String temp = inputs[j];
	    		for(int i=0; i<dics.length; i++){
	    			if(dics[i]!=(char)('a'+i))temp = temp.replace(dics[i], (char)('a'+i-32));
	    		}
				map.put(j+1, temp);
				
			}
			List<Map.Entry<Integer, String>> list = new LinkedList<Map.Entry<Integer, String>>( map.entrySet() );
			Collections.sort(list, new Comparator<Map.Entry<Integer, String>>(){
				@Override
				public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
					return o1.getValue().compareTo(o2.getValue());
				}
			});
			System.out.println(list.get(q).getKey());
    	}
    	in.close();
    }
}