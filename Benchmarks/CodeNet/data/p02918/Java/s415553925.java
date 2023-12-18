import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		String s=sc.next();
		char p=s.charAt(0);
		int count=0;
		int countk=1;
		for(int i=1; i<n; i++){
			if(p==s.charAt(i)){
				count++;
			}else{
				countk++;
				p=s.charAt(i);
			}
		}
		if(countk-k>=2){
			System.out.println(count+k*2);
		}else{
			if(countk-k<=0){
				System.out.println(n-1);
			}else{
				if(countk-k==1){
					System.out.println(count+1+(k-1)*2);
				}
			}
		}
	}
}
