import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int sameCount = 0;
        List<String> pastList = new ArrayList<String>();
        for (int index = 0; index < n; index++) {
           String str = sc.next();
           char[] charArray = str.toCharArray();
           Arrays.sort(charArray);
           String rslt = new String(charArray);
           for (String past : pastList) {
             if (past.equals(rslt)) sameCount++;
           }
          
          pastList.add(rslt);
        }
		System.out.println(sameCount);
	}
}
