import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main().run();
	}
	void run(){
		Scanner sc=new Scanner(System.in);
		String str[][];
		char ch;
		int n;
		Set<String> s=new TreeSet<String>();

		while(true){
			n=sc.nextInt();
			if(n==0) break;
			s.clear();
			
			str=new String[n][];
			sc.nextLine();
			for(int i=0;i<n;i++){
				str[i]=sc.nextLine().split(" ");
			}
			ch=sc.next().charAt(0);
			for(int i=0;i<n;i++){
				for(int j=0;j<str[i].length;j++){
//					System.out.println(str[i][j]);
					if(ch==str[i][j].charAt(0)){
						if(s.isEmpty()){
							s.add(str[i][j]);
							//System.out.print(str[i][j]);
						}
						else if(!s.contains(str[i][j])){
//							System.out.print(" "+str[i][j]);
							s.add(str[i][j]);
						}
					}
				}
			}
			if(s.isEmpty()){
				System.out.print("NA");
			}
			else{
				for(int i=0;i<5;i++){
					if(s.isEmpty()) break;
					if(i==0){
						System.out.print(((TreeSet<String>) s).first());
					}
					else{
						System.out.print(" "+((TreeSet<String>) s).first());
					}
						s.remove(((TreeSet<String>) s).first());
				}
				
			}
			System.out.println();
		}

	}//run

}