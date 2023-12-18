import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long r=0,g=0,b=0;
		String text = sc.next();
		char str[] = text.toCharArray();
		for(int i=0;i<n;i++){
			switch(str[i]){
				case 'R':
					r++;
					break;
				case 'G':
					g++;
					break;
				case 'B':
					b++;
					break;
			}
		}
		int pair = r*g*b;
		for(int i=1;i<n;i++){
			for(int j=0;j<i;j++){
				if(i+(i-j)<n){
					if(str[i]!=str[j]&&str[i]!=str[i+(i-j)]&&str[j]!=str[i+(i-j)])
					pair--;
				}
			}
		}
		System.out.println(pair);
	}
}
