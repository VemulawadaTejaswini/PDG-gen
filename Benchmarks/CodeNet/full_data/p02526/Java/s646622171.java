public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int count=0;
		int slength=sc.nextInt();
		int tt=0;
		int S[]=new int[slength];
		for(int i=0;i<slength;i++){
			int ss=sc.nextInt();
			S[i]=ss;
		}
		int tlength=sc.nextInt();
		for(int j=0;j<tlength;j++){
			tt=sc.nextInt();
			for(int k=0;k<slength;k++){
				if(S[k]==tt){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}