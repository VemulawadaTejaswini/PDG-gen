import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String s = scn.next();
      	byte[] asc;
      	asc = s.getBytes("US-ASCII");
      	for (int i=0; i<s.length(); i++) {
        	acs[i] = acs[i] + n;
           if(asc[i]>90) asc[i] = acs[i] - 26;
        }
      	for (int i=0; i<s.length(); i++) {
            System.out.print(asc[i]);
        }
	}
}
