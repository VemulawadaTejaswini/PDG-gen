import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0) break;
			int[] data = new int[26];
			String gomi=sc.nextLine();
			String l=sc.nextLine();
			String[] l2=l.split(" ");
			String line="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			int rem=n;
			boolean flag=true;
			for(int i=0;i<n;++i){
				data[line.indexOf(l2[i])]++;
				rem--;
				int max=max(data),count=0,num=0;
				for(int j=0;j<26;++j){
					if(max<=data[j]+rem){
						count++;
						if(count==1) num=j;
					}
				}
				if(count==1){
					System.out.println(line.charAt(num)+" "+(n-rem));
					i=n;
					flag=false;
				}
			}
			if(flag==true) System.out.println("TIE");
		}
	}
	public static int max(int[] data){
		int num=data[0];
		for(int i=1;i<26;++i){
			num=Integer.max(num, data[i]);
		}
		return num;
	}
}

