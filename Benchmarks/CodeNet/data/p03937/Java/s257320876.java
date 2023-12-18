import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in);
		int i = Integer.parseInt(as.next());
		int j = Integer.parseInt(as.next());
		String[] a;
		a = new String[i];
		for(int s=0;s<i;s++){
			a[s] = as.next();
		}
		boolean po = true;
		int t = j-1;
		for(int s=i-1;s>=0;s--){
			for(int k=j-1;k>t;k--){
				if(String.valueOf(a[s].charAt(k)).equals("#")){
					po = false;
					break;
				}
			}
			for(int l=t;l>=0;l--){
				if(String.valueOf(a[s].charAt(l)).equals(".")){
					t = l+1;
					for(int q=l-1;q>=0;q--){
						if(s!=0&&l==0&&String.valueOf(a[s].charAt(q)).equals("#")){
							po = false;
						}
					}
					break;
				}
				if(s!=0&&l==0&&String.valueOf(a[s].charAt(l)).equals("#")){
					t = 0;
				}
			}
			if(!po){
				break;
			}
		}
		if(po){
			System.out.println("Possible");
		}else{
			System.out.println("Impossible");
		}
	}
}