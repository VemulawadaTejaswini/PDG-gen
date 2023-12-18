import java.util.Scanner;
public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int countMinutes=0;
		int peopleNum=0;
		int moveMax[]=new int[5];
		int place[]=new int[6];
		peopleNum=scanner.nextInt();
		for(int i=0;i<moveMax.length;i++) {
			moveMax[i]=scanner.nextInt();
		}
		place[0]=peopleNum;
		while(place[5]!=peopleNum) {
			for(int i=4;i>=0;i--) {
				if(place[i]>0) {
					if(place[i]<=moveMax[i]) {
						place[i+1]+=place[i];
						place[i]=0;
					}else{
						place[i]-=moveMax[i];
						place[i+1]+=moveMax[i];
					}

				}
			}
			countMinutes++;
		}
		System.out.println(countMinutes);
	}
}