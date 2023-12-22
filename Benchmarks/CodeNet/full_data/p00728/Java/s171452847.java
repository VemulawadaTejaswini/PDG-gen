import java.util.Scanner;
public class Main{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i>-1;i++){
			int num=sc.nextInt();
			if(num==0){
				break;
			}else{
			int ave=0;
			int max=0;
			int min=1000;
			int sum=0;
				int[] score =new int[num];
				//Input scores
				for(int j=0;j<num;j++){
					score[j]=sc.nextInt();
					if(j==0){
						max=score[0];
						min=score[0];
					}
					sum+=score[j];
					if(score[j]>max){
						max=score[j];
					}else if(score[j]<min){
						min=score[j];
					}
					ave=(sum-max-min)/(num-2);

				}
				System.out.println(ave);
				}
		}
	}
}