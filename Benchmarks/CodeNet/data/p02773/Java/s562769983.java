
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Set<String> set =new HashSet<String>();
		int n =sc.nextInt();
		String[] s=new String[n];
		for (int i = 0; i < s.length; i++) {
			s[i]=sc.next();
		}
		sc.close();

		int []a=new int[n];
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				if(s[i].equals(s[j])==true){
					a[i]++;
				}
			}
		}
		List<Integer> list =f(a);
		for (int i = 0; i < list.size(); i++) {
			set.add(s[list.get(i)]);
		}
		String s1 =set.toString();
		s1=s1.substring(1,s1.length()-1);
		String []s2=s1.split(",");
		print(s2);
		for (int i = 0; i < s2.length; i++) {
			System.out.println(s2[i].trim());
		}
	}
	
	//将一个字符串数组按照字典的顺序输出
	static void  print(String []s){
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length-1-i; j++) {
				if(s[j].trim().charAt(0)>s[j+1].trim().charAt(0)){
					String s1=s[j];
					s[j]=s[j+1];
					s[j+1]=s1;
				}
			}
		}
	}
	
	//找到出现次数最多的字符串的下标
	static List<Integer> f(int []a){
		List<Integer> list =new ArrayList<Integer>();
		int max=a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max){
				max=a[i];
			}
		}

		for (int i = 0; i < a.length; i++) {
			if(max==a[i]){
				list.add(i);
			}
		}
		return list;
	} 

}
