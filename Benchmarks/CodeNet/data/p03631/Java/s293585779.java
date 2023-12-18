import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		String k=String.valueOf(n);
		String kk[]=k.split("");
		boolean ans=true;
		for(int i=0;i<n;i++){
			if(kk[i].equals(kk[2-i])){
			}else{
				ans=false;
				break;
			}
		}

		if(ans==true){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

  }
}
