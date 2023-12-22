import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for(int i=0;i<1000;i++){
			String s = sc.next();
			boolean flag = true;
			if(s.length()>1){
				for(int j=1;j<s.length();j++){
					int pre = s.codePointAt(j-1);
					int nex = s.codePointAt(j);
					
					if(pre==69 && nex%2==0) continue;
					if(pre%2==0 && nex==69) continue;
					if(pre==65 && (nex==66 || nex==68)) continue;
					if(pre==66 && (nex==65 || nex==67)) continue;
					if(pre==67 && (nex==66 || nex==70)) continue;
					if(pre==68 && (nex==65 || nex==71)) continue;
					if(pre==70 && (nex==67 || nex==73)) continue;	
					if(pre==71 && (nex==68 || nex==72)) continue;	
					if(pre==72 && (nex==71 || nex==73)) continue;	
					if(pre==73 && (nex==70 || nex==72)) continue;
					
					flag = false;
					break;
				}
			}
			if(flag==true) System.out.println(s);
		}
	}

}