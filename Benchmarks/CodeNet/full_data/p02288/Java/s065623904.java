import java.util.*;
public class Main {
	    public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
		int a=sc.nextInt();
		int arr[]=new int [a*a];
		for(int i=1;i<=a;i++){
			arr[i]=sc.nextInt();			
		}
		for(int i=a;i>0;i--){
			for(int j=i;j>0;j=j/2){
				if(arr[j]<arr[j*2+1]){
					int b=arr[j];
					arr[j]=arr[j*2+1];
					arr[j*2+1]=b;
				}
				else if(arr[j]<arr[j*2]){
					int b=arr[j];
					arr[j]=arr[j*2];
					arr[j*2]=b;
				}
			}
		}

		System.out.print(" ");
		for(int i=0;i<arr.length;i++)
			if(arr[i]!=0 && i!=arr.length-1)
				System.out.print(arr[i]+" ");
		}
	    }
}
