import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[] cs=new int[c+1];
		for(int i=0;i<c+1;i++){
			cs[i]=0;
		}
		for(int i=0;i<r;i++){
			int rs=0;
			for(int j=0;j<c;j++){
				int a=sc.nextInt();
				rs+=a;
				cs[j]+=a;
				System.out.print(a+" ");
			}
			System.out.println(rs);
			cs[c]+=rs;
		}
		for(int i=0;i<c;i++){
			System.out.print(cs[i]+" ");
		}
		System.out.println(cs[c]);
	}
}