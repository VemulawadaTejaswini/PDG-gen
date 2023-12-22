import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n;
		String tmpData;
		try{
			n=sc.nextInt(); //変換表文字数
			while(n!=0){
				String[][] str=new String[n][2];
				for(int j=0;j<n;j++){	//変換表の入力
					str[j][0]=sc.next();
					str[j][1]=sc.next();
				}
				int dn=sc.nextInt();	//変換データ文字数
				for(int j=0;j<dn;j++){
					tmpData=sc.next();
					for(int k=0;k<n;k++){
						if(tmpData.equals(str[k][0])){
							tmpData=str[k][1];
							break;
						}
					}
					System.out.print(tmpData);
				}
			}
			sc.close();
		}catch(Exception e){
			System.out.println("Error");
		}
	}
}