import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),l=sc.nextInt();
		String[]sent=new String[n];
		char[][]ch=new char[n][l];
		int[][]checkch=new int[n][l];
		String ans=null;
		
		for(int i=0;i<n;i++){
			sent[i]=sc.nextLine();
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<l;j++){
				ch[i][j]=sent[i].charAt(j);
				checkch[i][j]=ch[i][j];
			}
		}
		for(int i=n-1;i>=0;i--){
			for(int j=0;j<l-1;j++){
				if(checkch[j][i]>checkch[j+1][i]){
					String t=sent[j];
					sent[j]=sent[j+1];
					sent[j+1]=t;
				}
			}
		}
		for(int i=0;i<n;i++){
			ans+=sent[i];
		}
		System.out.println(ans);
	}

}
