import java.util.*;
import java.util.Map.Entry;

//文字操作
class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		while(sc.hasNext()){
			char[] str=sc.next().toCharArray();

			boolean iso=false;
			for(int i=0;i<3;i++){
				if(str[i*3+0]=='o'&&str[i*3+1]=='o'&&str[i*3+2]=='o'){
					iso=true;
				}
				if(str[i+3*0]=='o'&&str[i+3*1]=='o'&&str[i+3*2]=='o'){
					iso=true;
				}
			}
			if(str[0]=='o' && str[4]=='o' && str[8]=='o'){
				iso=true;
			}
			if(str[2]=='o' && str[4]=='o' && str[6]=='o'){
				iso=true;
			}

			boolean isx=false;
			for(int i=0;i<3;i++){
				if(str[i*3+0]=='x'&&str[i*3+1]=='x'&&str[i*3+2]=='x'){
					isx=true;
				}
				if(str[i+3*0]=='x'&&str[i+3*1]=='x'&&str[i+3*2]=='x'){
					isx=true;
				}
			}
			if(str[0]=='x' && str[4]=='x' && str[8]=='x'){
				isx=true;
			}
			if(str[2]=='x' && str[4]=='x' && str[6]=='x'){
				isx=true;
			}

			if(iso){
				ln("o");
			}else if(isx){
				ln("x");
			}else{
				ln("d");
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}