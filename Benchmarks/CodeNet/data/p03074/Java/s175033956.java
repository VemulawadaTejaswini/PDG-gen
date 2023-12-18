import java.util.*;

public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int times = sc.nextInt();
		String s = sc.next();
		int counter=0;
		String st[] = s.split("");
		
		for(int i=0;i<length-1;i++){
			if(!(st[i].equals(st[i+1]))){
				counter++;
			}
		}

		int counter2=0;
		int point[] = new int[counter+1];
		int j=0;
		for(int i=0;i<length-1;i++){
			if(!(st[i].equals(st[i+1]))){
				point[j] = i-counter2+1;
				counter2 =i;
				j++;
			}
		}
		if(st[length-1].equals(st[length])){
			point[counter2-1]=1;
		}

		int[] cumulativesum = new int[counter];
		cumulativesum[0]=0;
		for(int i=1;i<=counter;i++)
			cumulativesum[i]=cumulativesum[i-1]+point[i];

		int max1=0;
		int max2=0;
		int k=0;

		if(counter>2*times){
			k=counter-2*times+1;
		}else
			k=counter;

		for(int i=0;i<k;i++){
			if(cumulativesum[i]>max1)
				max1=cumulativesum[i];
		}

		if(counter>2*k-1){
			k=counter-2*times;
		}else
			k=counter;

		for(int i=0;i<k;i++){
			if(cumulativesum[i]>max2)
				max2=cumulativesum[i];
		}

		System.out.println(Math.max(max1,max2));
	}
}