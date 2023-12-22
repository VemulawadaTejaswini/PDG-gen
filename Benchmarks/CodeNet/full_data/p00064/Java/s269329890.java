import java.util.Scanner;

public class Main {
	static char ch[];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,sum=0,k;
		while(sc.hasNext()){
			String str=sc.next();
			ch=str.toCharArray();
			for(i=ch.length-1;i>=0;i--){
				if('0'<=ch[i] && ch[i]<='9'){
					j=1;
					for(k=i;k>=0;k--){
						if('0'<=ch[k] && ch[k]<='9'){
							sum+=(ch[k]-'0')*j;
							//System.out.println("ch="+(ch[k]-'0')*j);
							j=j*10;
						}
						else{
							i=k;
							break;
						}
					}//
				}//if
			}
		}
		System.out.println(sum);
	}
}