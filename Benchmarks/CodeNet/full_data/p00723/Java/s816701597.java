import java.util.Scanner;
import java.util.ArrayList;


public class Main {
	
	static String change(String str){
		StringBuffer sb = new StringBuffer(str);
		str = sb.reverse().toString();
		return str;
	}
	
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int m = sc.nextInt();
			for(int i=0;i<m;i++) {
				String tomas = sc.next();
				ArrayList<String> pettern = new ArrayList<>();
				
				String s = "";
				
				for(int j=0;j<tomas.length()-1;j++) {
						
					s = change(tomas.substring(0,j+1)) + change(tomas.substring(j+1,tomas.length()));
					pettern.add(s);
							
					s = change(tomas.substring(0,j+1)) + tomas.substring(j+1,tomas.length());
					pettern.add(s);
						
					s = tomas.substring(0,j+1) + change(tomas.substring(j+1,tomas.length()));
					pettern.add(s);
						
					s = tomas.substring(0,j+1) + tomas.substring(j+1,tomas.length());
					pettern.add(s);
						
					s = change(tomas.substring(j+1,tomas.length())) +  change(tomas.substring(0,j+1)) ;
					pettern.add(s);
					
					s = tomas.substring(j+1,tomas.length()) + change(tomas.substring(0,j+1)) ;
					pettern.add(s);
						
					
					s =  change(tomas.substring(j+1,tomas.length())) + tomas.substring(0,j+1) ;
					pettern.add(s);
					
					s = tomas.substring(j+1,tomas.length()) + tomas.substring(0,j+1) ;
					pettern.add(s);
			
				}
				
				int count=0;
				
				for(int l=0;l<pettern.sixe()-1;l++) {
					for(int n=l+1;n<pettern.size();n++) {
						if(!pettern.get(l).equals(pettern.get(n))) count++;
					}
				}
				
				System.out.println(count);
				
			}
		}

	}
