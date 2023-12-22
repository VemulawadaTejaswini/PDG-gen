import java.util.*;
class Main{
	static Scanner sc;
	static int n,num;
	public static void main(String[]args){
		sc=new Scanner(System.in);
		
		while(sc.hasNext()){
			n=sc.nextInt();
			num=0;
			for(int j=0;j<10;j++){
				for(int k=0;k<10;k++){
					for(int l=0;l<10;l++){
						for(int m=0;m<10;m++){
							if(j+k+l+m==n){num++;}
						}
					}
				}
			}
			System.out.println(num);
		}
	}
}