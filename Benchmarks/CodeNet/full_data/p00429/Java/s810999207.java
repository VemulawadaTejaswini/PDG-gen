import java.util.Scanner;

//String
public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			char[] s = sc.next().toCharArray();
			while(n--!=0){
				String t = "";
				int i = 0;
				char a = ' ';
				int c = 0;
				while(i<s.length){
					if(a==' '){
						a = s[i];
						c++;
					}
					else if(a==s[i]){
						c++;
					}
					else{
						t +=c+""+a;
						a = s[i];
						c = 1;
					}
					i++;
				}
				t+=c+""+a;
				s = t.toCharArray();
			}
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}