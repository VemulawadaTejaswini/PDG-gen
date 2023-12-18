import java.util.*;
public class Main{
	private static String board = "CODEFESTIVAL2016";
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);

        while(cin.hasNext()){
        	int n = cin.nextInt();
        	ArrayList<String> list = new ArrayList<String>();
        	for(int i=0;i<n;i++){
        		list.add(cin.next());
        	}
        	String[] list1 = (String[])list.toArray(new String[n]);
        	int q = cin.nextInt();
        	int[] source = new int[q];
        	String[] order = new String[q];
            for(int i=0;i<q;i++){
            	source[i] = cin.nextInt()-1;
        		order[i] = cin.next();
        	}
            String flg="";
            String od = "";
            for(int i=0;i<source.length;i++){
            	flg = list1[source[i]];
            	od = order[i];           	           	
            	System.out.println(findIndex(list,od,flg,0));
            }
        }
    }
    public static int findIndex(ArrayList<String> list, String order,String aim,int pos){
    	if(list.size()==1||pos>=aim.length()) return 1;
    	ArrayList<String> list1 = new ArrayList<String>();
    	list1.addAll(list);
    	int count = 0;
    	int am = order.indexOf(aim.charAt(pos));
    	String s = "";int i=0;
    	while(i<list1.size()){
    		s = list1.get(i);
    		if(s.length()<=pos||order.indexOf(s.charAt(pos))<am){
    			count++;
    			list1.remove(s);
    		}else if(order.indexOf(s.charAt(pos))==am){
    			i++;
    		}else if(order.indexOf(s.charAt(pos))>am){
    			list1.remove(s);
    		}
    	}
    	count += findIndex(list1,order,aim,pos+1);
    	return count;
    }

}