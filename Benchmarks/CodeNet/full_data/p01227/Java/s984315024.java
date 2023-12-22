import java.util.*;
public class Main {
    private static Scanner sc;
    public static void main(String[] args){
    	int a,b,c,d,e;
    	List <Integer> list1 = new ArrayList<Integer>();
    	List <Integer> list2 = new ArrayList<Integer>();
        sc = new Scanner(System.in);
        a=sc.nextInt();
        for (int i=0; i<a; i++){
        	b=sc.nextInt();
        	c=sc.nextInt();
        	for (int j=0; j<b; j++){
        		list1.add(d=sc.nextInt());
        	}
        	int sum = 0;
        	if (b-c<1){
        		System.out.println(0);
        	}
        	else{
        		for (int l=0; l<b-1; l++){
        			e=list1.get(l+1)-list1.get(l);
        			list2.add(e);	
        		}
        		Collections.sort(list2);
        		for (int m=0; m<b-c; m++){
        			sum=sum+list2.get(m);
        		}
        		System.out.println(sum);
        	}
        list1.clear();
        list2.clear();
       	}    	
    }
}