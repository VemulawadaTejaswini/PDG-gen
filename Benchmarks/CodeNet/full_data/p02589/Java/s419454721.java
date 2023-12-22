
import java.util.*;
class Solution {
public static int mod=1000000007;

int N;

	
	

	public static void main(String[] args) {
			
	Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		
		
		String arr[]=new String[n];
		
		int pairs=0;
		
		for(int i=0;i<n;i++)
			arr[i]=sc.next();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(check(arr[i],arr[j])) {
					System.out.println(arr[i]+" "+arr[j]);
					pairs++;
				}
					
				
			}
		}
		
		System.out.println(pairs);
		
	
	
		
		
		
		
	
		
		
		
	}
	
	public static boolean check(String s1,String s2) {
		if(s2.length()>s1.length())
			return check(s2,s1);
		if(s2.length()==s1.length() && s1.equals(s2))
			return true;
		if(s1.length()==s2.length())
			return false;
		
		boolean found=false;
		int j=0;
		boolean f=false;
		int count=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==s2.charAt(0)) {
				f=true;
				j++;
			}
			else if(f && s1.charAt(i)==s2.charAt(j)) {
				j++;
				count=0;
			}
			else if(f)
				count++;
			if(count==2) {
				count=0;
				f=false;
			}
			if(j==s2.length()) {
				if(i==s1.length()-1 || i==s1.length()-2) {
				found=true;
				break;
				}
				f=false;
				count=0;
				j=0;
			}
			
			
		}
		
		return found;
	}
	
	
	
		}
	
	
	
	
		
	
	

		
		

	
	
	
	

			
	
		
	
	
		
	
	
	
	
	


