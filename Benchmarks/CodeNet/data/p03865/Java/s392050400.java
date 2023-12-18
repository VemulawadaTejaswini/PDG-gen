import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in);
		String n = as.next();
		String[] sa = new String[n.length()];
		int f=-1;
		for(int i=0;i<n.length();i++){
			sa[i] = String.valueOf(n.charAt(i));
		}
		for(int i=1;i<n.length()-1;i++){
			if(sa[i].equals(".")){
				continue;
			}else{
				for(int s=1;s<n.length()-i;s++){
					if(sa[i+s].equals(".")){
						continue;
					}else{
						if(sa[0].equals(sa[i+s])){
							continue;
						}else{
							sa[i]=".";
							f=f*-1;
							i=1;
							break;
						}
					}
				}
			}
		}
		if(f==1){
			System.out.println("First");
		}else{
			System.out.println("Second");
		}
	}
}