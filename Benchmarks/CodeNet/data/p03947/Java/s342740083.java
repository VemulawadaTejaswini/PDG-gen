import java.util.*;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char c[]=sc.next().toCharArray();
		int n=c.length;
		String ans="";
		for(int i=0;i<n;i++){
			
			char a=c[i];
			ans+=a;
			for(int j=i+1;j<n;j++){
				if(c[j]==a){
					if(j==n-1){
						i=n-1;
					}
					continue;
				}else{
					
					i=j-1;
					break;
				}
			}
						
			
		}
		
		System.out.println(ans.length()-1);
		
	}

}