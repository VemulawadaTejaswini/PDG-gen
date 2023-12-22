import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] team=new int[n];
		int[] tmp=new int[n];
		int teamA,teamB,scoreA,scoreB,cnt;
		for(int i=0;i<n*(n-1)/2;i++){
			teamA=sc.nextInt();
			teamB=sc.nextInt();
			scoreA=sc.nextInt();
			scoreB=sc.nextInt();
			if(scoreA>scoreB){
				team[teamA-1]+=3;
			}
			else if(scoreA<scoreB){
				team[teamB-1]+=3;
			}
			else{
				team[teamA-1]+=1;
				team[teamB-1]+=1;
			}
		}
		tmp=(int[])team.clone();
		java.util.Arrays.sort(tmp);
		for(int i=0;i<n;i++){
			cnt=0;
			for(int j=n-1;j>=0;j--){
				cnt++;
				if(team[i]==tmp[j]){
					System.out.println(cnt);
					break;
				}
			}
		}
	}
}