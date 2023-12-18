import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		String[] list = s.split("");
		Arrays.sort(list);
      	int[] a = new int[s.length()];
      	for(int i=0; i<s.length(); i++) a[i] = 0;
      	for(int i=1; i<s.length(); i++){
        	while(int j=0; j<s.length()){
              if(a[i].equals(a[i-1])) a[j]++;
              else j++;
            }
        }
      	String ans = "Yes";
      	for(int i=1; i<s.length(); i++){
        	if(a[i]%2==0) ans = "No";
        }
      	System.out.println(ans);
	}
}