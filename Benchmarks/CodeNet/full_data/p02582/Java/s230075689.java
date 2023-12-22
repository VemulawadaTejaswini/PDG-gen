import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S=sc.next();
		int count=0;
		int tmp=0;
		char[] weather=new char[3];
		for(int i=0;i<3;i++){
			weather[i]=S.charAt(i);
		}
		for(int j=0;j<3;j++){
			if(weather[j]=='R'){
				tmp++;
				if(count<tmp)count=tmp;
			}else{
				if(count<tmp)count=tmp;
				tmp=0;
			}
			
		}
		System.out.println(count);

	}
}