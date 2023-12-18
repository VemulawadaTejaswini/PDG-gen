import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n=Integer.parseInt(sc.next());

		String str=sc.next();
		String sh="#";
		String dottt=".";
		int min=200000,cnt;

		String[] str2=str.split(""); //一文字ずつ取り出す
		cnt=0;

		for(int i=0;i<n-1;i++){
			if(str2[i].equals(sh)==true&&str2[i+1].equals(dottt)==true){
				cnt+=1;
				str2[i+1]=dottt;
			}
		}

		System.out.println(cnt);
		sc.close();

	}

}
