import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			String st = scan.next();
			int count = 1;
			String temp = "";
			char c;
			for(int i = 0;i < n;i++){
				c = st.charAt(0);
				temp = "";
				for(int j = 1;j < st.length();j++){
					if(c == st.charAt(j)){
						count++;
					}else{
						temp += (count + "" + c);
						c = st.charAt(j);
						count = 1;
					}
				}
				st = temp + (count + "" + c);
				count = 1;
			}
			System.out.println(st);
		}
	}
}