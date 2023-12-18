import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	Map<Integer,Integer> map=new TreeMap<Integer,Integer>();

    	int a=sc.nextInt();

    	int A;
    	int []color=new int[100001];
    	int ans=1;int flag=-1;
    	for(int i=0;i<a;i++) {
    		A=sc.nextInt();
    		color[A]++;
    		if(map.containsKey(A)) {
    			ans++;
    			if(flag!=A&&color[A]>2)ans+=color[A]-2;
    			if(flag==A)ans--;
    		}
    		map.put(A,i);
    		flag=A;
    	}
			System.out.println(ans%(1000000000+7));
    }
}