import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int[] a = new int[n+2];
		
		for(int i=1;i<=n;i++){
			String s = sc.next();
			int x = sc.nextInt();
			if(s.equals("(")){
				a[i]=x;
			}
			else{
				a[i]=-x;
			}
		}
//		int left=0,right=a.length-1;
//		for(int i=1;i<=n;i++){
//			if(a[i]>0&&a[i+1]<0){
//				int c1=0,c2=0;
//				for(int j = i;j>0;j--){
//					c1+=a[j];
//					a[j]=0;
//				}
//				int j=0;
//				for(j=i+1;j<=n;j++){
//					if(a[j]>=0)break;
//					c2-=a[j];
//					a[j]=0;
//				}
//				if(c1==c2){
//					i=j-1;
//				}
//				else{
//					System.out.println("NO");return;
//				}
//			}
//		}
		int cnt=0;
		for(int i=1;i<=n;i++){
			cnt+=a[i];
			if(cnt<0){
				System.out.println("NO");
				return;
			}
		}
		/*
		System.out.println("OK");
		while(left<right){
			if(a[left]>0&&a[right]>0||a[left]<0&&a[right]<0){
				System.out.println("NO");return;
			}
			if(a[left]<0||a[right]>0){
				System.out.println("NO");return;
			}
			if(a[left]>0&&a[right]<0){
				int r = -a[right];
				if(a[left]>r){
					a[left]-=r;
					right--;
				}
				else if(a[left]<r){
					a[right]+=a[right];
					left++;
				}
				else{
					left++;
					right--;
				}
			}


		}
		*/
//		for(int i=0;i<n+2;i++){
//			System.out.println(a[i]);
//			if(a[i]!=0){
//				System.out.println("NO");
//				return;
//			}
//		}
		if(cnt==0){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}

}