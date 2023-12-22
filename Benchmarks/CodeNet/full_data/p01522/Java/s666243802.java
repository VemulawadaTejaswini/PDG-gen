import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			int k=sc.nextInt();
			int bort[][]=new int[k][];//bort[i]テ」ツ?ッiテァツ閉ェテァツ崢ョテ」ツ?ョテ」ツδ愿」ツδシテ」ツδ暗」ツ?ォテ」ツ?ェテ」ツつ凝」ツつヲテ」ツつオテ」ツつョ
			for(int i=0; i<k; i++){
				bort[i]=new int[sc.nextInt()];
				for(int j=0; j<bort[i].length; j++){
					bort[i][j]=sc.nextInt();
				}
			}
			int r=sc.nextInt();
			int p[][]=new int[r][2];
			for(int i=0;i<r;i++){
				p[i][0]=sc.nextInt();
				p[i][1]=sc.nextInt();
			}//テ」ツ?禿」ツ?禿」ツ?セテ」ツ?ァinput
			Set<Integer> bad=new TreeSet<Integer>();
			for(int i=0; i<k; i++){
				Set<Integer> s=new TreeSet<Integer>();
				for(int j=0; j<bort[i].length; j++){
					s.add(bort[i][j]);
				}
				//System.out.println("!"+s.size());
				for(int j=0;j<r;j++){
					if(s.contains(p[j][0]) && s.contains(p[j][1])){
						bad.add(p[j][0]);bad.add(p[j][1]);
					}
				}
			}
			System.out.println(bad.size());
		}

	}

}