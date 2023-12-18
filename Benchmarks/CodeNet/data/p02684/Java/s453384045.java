import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    long k=sc.nextLong();
    int[] a=new int[n];
    for(int i=0;i<n;i++)a[i]=sc.nextInt();
    int g=0;
    List<Integer> list=new ArrayList<>();
    Set<Integer> set=new HashSet<>();
    list.add(1);
    set.add(1);
    boolean flag=true;
    while(a[g]!=1) {
    	if(!set.add(a[g])) {
    		flag=false;
    		break;
    	}
    	list.add(a[g]);
    	g=a[g]-1;
    }
    int res=(int)(k%list.size());
    if(flag)System.out.println(list.get(res));
    else {
    	if(k<list.size()) {
    		System.out.println(list.get((int)k));
    	}else {
    		if(list.size()-list.indexOf(a[g])==1)res=list.indexOf(a[g]);
    		else if(k%(list.size()-list.indexOf(a[g]))!=(list.size()-list.indexOf(a[g]))-1){
    			res=(int)(k%(list.size()-list.indexOf(a[g])))+list.size()-list.indexOf(a[g]);
    		}else {
    			res=(int)(k%(list.size()-list.indexOf(a[g])));
    		}
    		System.out.println(list.get(res));
    	}
    }
    //System.out.println(list);
  }
}
