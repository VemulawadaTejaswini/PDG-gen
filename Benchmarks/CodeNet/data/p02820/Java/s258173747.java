import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int r = sc.nextInt();
		int s = sc.nextInt();
		int p = sc.nextInt();
		long sum = 0;
		int count=0;
		String t = sc.next(),buff="";

		for(int i=0;i<t.length();i++) {
			if(i<k) {
				if(t.substring(i,i+1).equals("r")){
					//System.out.println("p");
					sum+=p;
					buff+="p";
				}else if(t.substring(i,i+1).equals("s")) {
					//System.out.println("r");
					sum+=r;
					buff+="r";
				}else {
					//System.out.println("s");
					sum+=s;
					buff+="s";
				}
			}else {
				if(t.substring(i,i+1).equals("r")){
					 if(!t.substring(i,i+1).equals(buff.substring(i-k, i-k+1))) {
						 sum+=p;
						 buff+="p";
					 }else {
						 if(r>s) {
							 buff+="r";
						 }else {
							 buff+="s";
						 }
					 }
					//System.out.println("p");
				}else if(t.substring(i,i+1).equals("s")) {
					 if(!t.substring(i,i+1).equals(buff.substring(i-k, i-k+1))) {
						 sum+=r;
						 buff+="r";
					 }else {
						 if(p>s) {
							 buff+="p";
						 }else {
							 buff+="s";
						 }
					 }
				}else {
					 if(!t.substring(i,i+1).equals(buff.substring(i-k, i-k+1))) {
						 sum+=s;
						 buff+="s";
					 }else {
						 if(r>p) {
							 buff+="r";
						 }else {
							 buff+="p";
						 }
					 }
				}
			}
		}
		System.out.println(sum);
		/*for(int i=0;i<t.length();i++) {
			System.out.println(t.substring(i, i+1));
		}*/
	}
}


