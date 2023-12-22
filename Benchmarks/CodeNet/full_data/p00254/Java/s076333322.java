import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String s = sc.next();
			if(s.compareTo("0000")==0)break;
			
			String[] f = new String[4];
			int count=0;
			int L, S;
			while(true){
				if(s.compareTo("6174")==0){
					System.out.println(count);
					break;
				}
				for(int i=0;i<4;i++){
					f[i] = s.substring(i,i+1);
				}
				if(f[0].compareTo(f[1])==0 && f[1].compareTo(f[2])==0 && f[2].compareTo(f[3])==0){
					System.out.println("NA");
					break;	
				}
				Arrays.sort(f);
				L = Integer.valueOf(f[3])*1000 + Integer.valueOf(f[2])*100 + Integer.valueOf(f[1])*10 + Integer.valueOf(f[0]);
				S = Integer.valueOf(f[0])*1000 + Integer.valueOf(f[1])*100 + Integer.valueOf(f[2])*10 + Integer.valueOf(f[3]);
				s = Integer.toString(L-S);
				count++;
				if(s.length()==1){
					s = "000" + s;
				}else if(s.length()==2){
					s = "00" + s;
				}else if(s.length()==3){
					s = "0" + s;
				}
			}
		}
		
	}	
}