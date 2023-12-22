import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
     
	static List<Integer> list=new ArrayList<Integer>();
    static boolean[] num=new boolean[150000];
     
    static void prime(int n) {
        for(int i=2; i*n<150000; i++) {
            num[n*i]=false;
        }
    }
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //while(sc.hasNext()) {
        for(int i=2; i<150000; i++) {
        	num[i]=true;
        }
        num[0]=false;
        num[1]=false;
        for(int i=2; i<150000; i++) {
        	if(num[i]) {
        		list.add(i);
        		prime(i);
        	}
        }
        while(sc.hasNext()) {
        	int N=sc.nextInt();
        	int P=sc.nextInt();
        	if(N==-1 && P==-1)	break;
        	List<Integer> res=new ArrayList<Integer>();
        	int k=0;
        	//System.out.println(list.get(1));
        	while(list.get(k)<=N) {
        		k++;
        	}
        	for(int i=k; i<k+P; i++) {
        		for(int j=i; j<k+P; j++) {
        			res.add(list.get(i)+list.get(j));
        		}
        	}
        	Collections.sort(res);
        	System.out.println(res.get(P-1));
        }
             
        
    }
}
