import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int n=sc.nextInt();
				if(n==0) break;
				String[] code=new String[n+1];
				for(int i=0; i<n; i++) {
					String str=sc.next();
					String s="";
					s+=String.valueOf(str.charAt(0));
					for(int j=0; j<str.length()-1; j++) {
						if(str.charAt(j)=='a'|| str.charAt(j)=='i'|| str.charAt(j)=='u'|| str.charAt(j)=='e'|| str.charAt(j)=='o') {
							s+=String.valueOf(str.charAt(j+1));
						}
					}
					code[i]=s;
				}
				int c=0;
				int ans=0;
				for(int k=0; k<50; k++) {
					c=0;
					for(int i=0; i<n; i++) {
						for(int j=i+1; j<n; j++) {
							String str1=code[i].substring(0, Math.min(k+1, code[i].length()));
							String str2=code[j].substring(0, Math.min(k+1, code[j].length()));
							if(str1.equals(str2)){
								c=1;
							}
						}
					}
					if(c==0) {
						ans=k+1;
						break;
					}
				}
				if(c>0) {
					System.out.println(-1);
				}
				else {
					System.out.println(ans);
				}
				
			}


		}
	}
}
