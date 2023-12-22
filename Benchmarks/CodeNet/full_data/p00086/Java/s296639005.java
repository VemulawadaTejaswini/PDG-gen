import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			boolean[] flag=new boolean[101];
			int count=0;
			while(true){
				int a1=sc.nextInt();
				int a2=sc.nextInt();
				if(a1==0&&a2==0){
					break;
				}if(!flag[a1]){
					flag[a1]=true;
					count++;
				}if(!flag[a2]){
					flag[a2]=true;
					count++;
				}
			}
			System.out.println(count%2==0?"NG":"OK");
		}
	}
}