import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c[]={1,2,1,2,1,4,1,4},i,j,tmp,min,count;
		int p[]=new int[8],d[]=new int[8];
		while(sc.hasNext()){
			for(i=0;i<8;i++){
				p[i]=sc.nextInt();
			}
			Arrays.fill(d,0);
			j=count=0;
			while(true){
				j=count;
				for(i=0;i<8;i++){
					tmp=c[j]-p[i];
					if(tmp<0) tmp=0;
					d[count]+=tmp;
					j++;
					if(j>=8) j=0;
				}
				count++;
				if(count==8) break;
			}
			min=0;
			for(i=0;i<8;i++){
				if(d[i]<d[min]){
					min=i;
				}
			}
			i=min;
			boolean f=false;
			while(true){
				if(f) 				
					System.out.print(" ");
				f=true;
				System.out.print(c[i]);
				if(i==min-1){
					break;
				}
				else if(min==0 && i==7){
					break;
				}
				i++;
				if(i>=8) i=0;
			}
			System.out.println();
		}//while
	}
}