import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		HashMap<Integer,Integer> map=new HashMap<>();
		int tmp=0;
		int ten=1;
		for(int i=s.length()-1; i>=0; i--){
			tmp=(tmp+(s.charAt(i)-'0')*ten)%2019;
			if(map.containsKey(tmp)){
				map.put(tmp,map.get(tmp)+1);
			}else{
				map.put(tmp,1);
			}
			ten*=10;
			ten%=2019;
		}
		long ans=0;
		for(int i=1; i<2019; i++){
			if(map.get(i)!=null){
				ans+=(long)map.get(i)*(map.get(i)-1)/2;
			}
		}
		if(map.get(0)!=null){
			ans+=map.get(0);
		}
		System.out.println(ans);
	}
}
