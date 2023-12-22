import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0){
				break;
			}
			int[] s=new int[n];
			for(int i=0;i<n;i++){
				s[i]=sc.nextInt();
			}
			int[] answer=calc(s,0);
			System.out.println(answer[answer.length-1]);
			for(int i=0;i<n-1;i++){
				System.out.print(answer[i]+" ");
			}
			System.out.println(answer[answer.length-2]);
		}
	}
	static int[] calc(int[] s,int count){
		int[] check=new int[s.length];
		for(int i=0;i<check.length;i++){
			for(int j=0;j<check.length;j++){
				if(s[i]==s[j]){
					check[i]++;
				}
			}
		}
		boolean flag=true;
		for(int i=0;i<check.length;i++){
			if(s[i]!=check[i]){
				flag=false;
				break;
			}
		}
		if(flag){
			int[] answer=new int[check.length+1];
			for(int i=0;i<answer.length-1;i++){
				answer[i]=check[i];
			}
			answer[answer.length-1]=count;
			return answer;
		}else{
			return calc(check,count+1);
		}
	}
}