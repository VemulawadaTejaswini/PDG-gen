

import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k[]  = new int[3];
		int count=0;
		int just=0;
		int low=0;
		int high=0;

		while(true){
			String[] line =sc.nextLine().split(" ");
			k[0]=Integer.parseInt(line[0]);
			k[1]=Integer.parseInt(line[1]);
			k[2]=Integer.parseInt(line[2]);
			while(!((k[0]<=k[1])&&(k[1]<=k[2]))){
				if(k[0]>k[1]){
					int store=k[0];
					k[0]=k[1];
					k[1]=store;
				}
				if(k[1]>k[2]){
					int store=k[1];
					k[1]=k[2];
					k[2]=store;
				}
			}
			if(k[2]>=k[0]+k[1]){
				break;
			}
			count=count+1;
			if(k[2]*k[2]==k[0]*k[0]+k[1]*k[1]){
				just=just+1;
			}
			if(k[2]*k[2]<k[0]*k[0]+k[1]*k[1]){
				low=low+1;
			}
			if(k[2]*k[2]>k[0]*k[0]+k[1]*k[1]){
				high=high+1;
			}
		}

		System.out.println(count+" "+just+" "+low+" "+high);
	}
}

