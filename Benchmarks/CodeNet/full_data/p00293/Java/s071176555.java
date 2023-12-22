import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{
	private static Scanner sc=new Scanner(System.in);
	private static List<Integer>temp=new ArrayList<Integer>();;
	private static List<String> ans=new ArrayList<String>();
	private static List<String> ST=new ArrayList<String>();


	public static void sub(){
		int N=sc.nextInt();
		for(int i=0;i<N;i++){
			int h=sc.nextInt();
			int m=sc.nextInt();
			temp.add(ansHM(h,m));
			if(m<10)ans.add(h+":"+"0"+m);
			else ans.add(h+":"+m);
		}
	}


	
	
	
	public static void main(String[] args ){
		while(sc.hasNextInt()){
			for(int i=0;i<2;i++){
				sub();
			}
			Collections.sort(temp);
			for(int i=0;i<temp.size();i++){
				
				ST.add(put(temp.get(i)));
			}
			for(int i=0;i<ST.size();i++){
				if(i>0){
					if(ST.get(i-1).equals(ST.get(i))){
						ST.remove(i);

					}
				}
				for(int j=0;j<ans.size();j++){
					if(ST.get(i).equals(ans.get(j))){
						System.out.print(ans.get(j));
						ans.remove(j);
						if((ans.size()!=0)){
							System.out.print(" ");
						}
						break;
					}
				}


			}
			System.out.println();

		}
	}




	public static int ansHM(int a,int b){
		int temp=a*100+b;
		return temp;

	}

	public  static String put(int a){
		int temp1=a/100;
		int temp2=a-(temp1*100);

		if(temp2<10) return temp1+":"+"0"+temp2;
		else return temp1+":"+temp2;

	}
}