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
			}//テ」ツ?禿」ツ?禿」ツ?セテ」ツ?ァinput
			
			for(int i=0; i<n; i++){
				Arrays.sort(time[i]);
			}
			//kテヲツ卍づ・ツ按サテ」ツ?ォテ・ツ?凖」ツ?」テ」ツ?ヲテ」ツつ凝、ツコツコテ」ツ?ョテ」ツδ敕」ツつ、テ」ツδウテ」ツδ暗」ツつ津ヲツアツづ」ツつ?」ツつ?
			for(int k=0; k<30; k++){
				int count=0;
				//テヲツ卍づ・ツ按サkテ」ツ?ォテ、ツスツ陛、ツコツコテヲツ伉?」ツ?」テ」ツ?ヲテ」ツつ凝」ツ??
				for(int i=0; i<n; i++){
					for(int j=0; j<length[i]; j++){
						if(time[i][j]==k){
							count++;
							break;
						}
						else if(k < time[i][j]) break;
					}
				}
				//テヲツ卍づ・ツ按サkテ」ツ?ォテ・ツ?凖」ツ?」テ」ツ?ヲテ」ツつ凝、ツコツコテ」ツ?ォテ」ツδ敕」ツつ、テ」ツδウテ」ツδ暗」ツつ津ィツカツウテ」ツ??
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
			//テヲツ慊?・ツーツ湘」ツ?ョテ」ツδ敕」ツつ、テ」ツδウテ」ツδ暗」ツ?ョテ・ツ・ツエテ」ツつ津ヲツ篠「テ」ツ??
			int min=2<<15;
			int index=-1;
			for(int i=0; i<n; i++){
				if(point[i] < min){
					min=point[i];
					index=i;
				}
				else if(point[i]==min){
					if(name[i].compareTo(name[index]) < 0){
						min=point[i];
						index=i;
					}
				}
			}
//			for(int i=0; i<n; i++){
//				System.out.println(point[i]+" "+name[i]);
//			}
			System.out.println(point[index]+" "+name[index]);
		}

	}
}