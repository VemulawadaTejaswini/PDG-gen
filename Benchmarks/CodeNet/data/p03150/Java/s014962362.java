import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String a=scan.next();
		int ans=0;
		if(a.indexOf("k")!=-1) {
			if(a.lastIndexOf("eyence")+5>a.indexOf("k")) {
				ans=1;
			}
		}if(a.indexOf("ke")!=-1) {
			if(a.lastIndexOf("yence")+4>a.indexOf("ke")+1) {
				ans=1;
			}
		}
		if(a.indexOf("key")!=-1) {
			if(a.lastIndexOf("ence")+3>a.indexOf("key")+2) {
				ans=1;
			}
		}
		if(a.indexOf("keye")!=-1) {
			if(a.lastIndexOf("nce")+2>a.indexOf("keye")+3) {
				ans=1;
			}
		}
		if(a.indexOf("keyen")!=-1) {
			if(a.lastIndexOf("ce")+1>a.indexOf("keyen")+4) {
				ans=1;
			}
		}
		if(a.indexOf("keyenc")!=-1) {
			if(a.lastIndexOf("e")>a.indexOf("keyenc")+5) {
				ans=1;
			}
		}
		if(a.indexOf("keyence")!=-1) {
				ans=1;
		}
		if(ans==1) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		}
	}