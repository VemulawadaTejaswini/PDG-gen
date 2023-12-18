import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main{
	
	static Scanner s=new Scanner(System.in);
	
	public static void main(String[] __){
		int n=s.nextInt();
		String in[]=new String[n+2];
		for(int i=0;i<n;i++)
			in[i]=s.next();
		in[in.length-2]="";
		in[in.length-1]="zzzzzzzzzzzzzzzzzzzzzzzzz";
		String target=s.next();
		Arrays.sort(in);
		
		ArrayList<Integer> res=new ArrayList<>();
		for(int i=0;i<n+1;i++) {
			if(in[i].compareTo(target)<=0&&in[i+1].compareTo(target)>=0)
				res.add(i+1);
		}
		
		System.out.println(res.stream().map(String::valueOf).collect(Collectors.joining(" ")));
	}
}
