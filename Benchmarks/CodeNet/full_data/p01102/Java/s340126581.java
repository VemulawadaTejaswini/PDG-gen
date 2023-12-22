import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(true) {
			String str1=in.next();
			if(str1.equals("."))break;
			String[] ss1=str1.split("\"",-1);
			String str2=in.next();
			String[] ss2=str2.split("\"", -1);
			
			if(ss1.length==ss2.length) {
				int def=0;
				for(int i=0;i<ss1.length;i++) {
					if(i%2==0 && !ss1[i].equals(ss2[i]))def+=2;
					else if(i%2==1 && !ss1[i].equals(ss2[i]))def++;
				}
				if(def==0)System.out.println("IDENTICAL");
				else if(def==1)System.out.println("CLOSE");
				else System.out.println("DIFFERENT");
			}
			else System.out.println("DIFFERENT");
		}
	}

}

