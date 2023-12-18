import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Integer> list3 = new ArrayList<>();
		List<Integer> list4 = new ArrayList<>();
		int count = 0;
		int count1 = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		for(int i = 1; i<=a; i++){
			int b = sc.nextInt();
			if(i%2==0){
				list2.add(b);
			}else{
				list1.add(b);
			}
		}
		for(int j = 0; j<list2.size();j++){
			c = list2.get(j);
			if(!list3.contains(c)){
			list3.add(c);
			count = 0;
		    for(int i :list2){
		    	if(c==i){
		    		count+=1;
		    	}
		    }
			if(d <count){
			d = count;
			}
			}
		}
		for(int j = 0; j<list1.size();j++){
			c = list1.get(j);
			if(!list4.contains(c)){
			list4.add(c);
			count1 = 0;
		    for(int i :list1){
		    	if(c==i){
		    		count1 +=1;
		    	}
		    }
			if(e <count1){
			   e = count1;
			}
			}
		}
		System.out.println(a-d-e);
	}
}