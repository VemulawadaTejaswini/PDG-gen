import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		while(true){
			String dat = sc.next();
			char[] num = dat.toCharArray();
			int sum = 0;
			if(dat.equals("0")) return;

			for(int i=0;i<dat.length();i++){
				sum = sum + (num[i] - '0'); 
			}

			System.out.println(sum);
		}	
		}
	}
