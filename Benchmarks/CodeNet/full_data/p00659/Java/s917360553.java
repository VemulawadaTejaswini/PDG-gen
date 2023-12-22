import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0) break;
			String name[]=new String[n];
			int time[][]=new int[n][];
			int length[]=new int[n];
			int point[]=new int[n];
			for(int i=0; i<n; i++){
				name[i]=sc.next();
				point[i]=0;
				length[i]=sc.nextInt();
				time[i]=new int[length[i]];
				for(int j=0; j<length[i]; j++){
					time[i][j]=sc.nextInt();
				}
			}//input
			for(int i=0; i<n; i++){
				Arrays.sort(time[i]);
			}
			for(int k=1; k<=30; k++){
				int count=0;
				for(int i=0; i<n; i++){
					for(int j=0; j<length[i]; j++){
						if(time[i][j]==k){
							count++;
							break;
						}
						else if(k<time[i][j]) break;
					}
				}
				for(int i=0; i<n; i++){
					for(int j=0; j<length[i]; j++){
						if(time[i][j]==k){
							point[i]+=(n-(count-1));
							break;
						}
						else if(k < time[i][j]) break;
					}
				}
			}
			int min=2<<15;
			int index=-1;
			for(int i=0; i<n; i++){
				if(point[i]<min){
					min=point[i];
					index=i;
				}
			}
			System.out.println(point[index]+" "+name[index]);
		}

	}
}