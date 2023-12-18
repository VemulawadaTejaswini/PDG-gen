import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
      	String[] list = s.split("");
      	int[] a = new int[s.length()];
		for(int i=0; i<s.length(); i++){
          a[i] = (int)list[i];
        }
      	int count0 = 0;
      	int count1 = 1;
      	for(int i=0; i<s.length(); i++){
          if(a[i]==0) count0++;
          if(a[i]==1) count1++;
        }
      	if(count0>=count1) System.out.println(count1);
      	if(count0<count1) System.out.println(count0);
	}
}