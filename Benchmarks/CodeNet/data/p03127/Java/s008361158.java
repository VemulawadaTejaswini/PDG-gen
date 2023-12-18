import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<n;i++){
		    int a = sc.nextInt();
		    list.add(a);
		}
		Collections.sort(list);

        boolean doFlag=true;

        int count=0;
		
		while(doFlag&&count<1000000010){
		    List<Integer> newList = new ArrayList<>();
            List<Integer> prevList = list;
		    
	        for(int i=0;i<list.size();i++){
	            int small =list.get(i);
	            for(int j=i+1;j<list.size();j++){
	                int big =list.get(j);
	                newList.add(big%small);
	            }
	        }
	        
	        Set<Integer> set = new HashSet<>();
	        set.addAll(newList);
            set.addAll(list);
	        
	        List<Integer> list2 = new ArrayList<>();
	        list2.addAll(set);
	        Collections.sort(list2);
	        if(!list2.isEmpty()&&list2.get(0)==0){
	            list2.remove(0);
	        }else if(!list2.isEmpty()&&list2.get(0)==1){
	            doFlag=false;
                list = list2;
	        }

//	        System.out.println("list2 "+list2);
//            System.out.println(prevList);
            
            Set<Integer> set2 = new HashSet<>();
            set2.addAll(prevList);
            
            List<Integer> list3 = new ArrayList<>();
            list3.addAll(set2);
            Collections.sort(list3);
            if(!list3.isEmpty()&&list3.get(0)==0){
                list3.remove(0);
            }
            
	        
	        
	        if(list3.containsAll(list2) && list2.containsAll(list3)||(list2.isEmpty()||list3.isEmpty())){
	            doFlag =false;
                list = list2;
	        }else{
	            list = list2;
	            count++;
	        }
		}
		
        System.out.println(list.get(0));
	}
}