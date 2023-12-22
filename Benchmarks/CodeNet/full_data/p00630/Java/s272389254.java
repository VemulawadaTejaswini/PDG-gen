import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			String s = sc.next();
			String t = sc.next();
			if(t.charAt(0)=='X') break;
			
			char[] a = s.toCharArray();
			char[] b = t.toCharArray();
			
			if(s.contains("_")==true){
				if(b[0]=='D') System.out.print(s);
				else{
					if(b[0]=='U' && (int)a[0]>96) a[0]-=32;
					else if(b[0]=='L' && (int)a[0]<96) a[0]+=32;
					for(int i=0;i<a.length;i++){
						if(a[i]=='_') a[i+1]-=32;
						else System.out.print(a[i]);
					}
				}
			}else{
				if(b[0]=='D'){
					if((int)a[0]<96) a[0]+=32;
					for(int i=0;i<a.length;i++){
						if((int)a[i]<96){
							System.out.print('_');
							a[i]+=32;
						}
						System.out.print(a[i]);
					}
				}else{
					if(b[0]=='U' && (int)a[0]>96) a[0]-=32;
					else if(b[0]=='L' && (int)a[0]<96) a[0]+=32;
					for(int i=0;i<a.length;i++) System.out.print(a[i]);
				}
			}
			System.out.println();	
		}	
	}	
}