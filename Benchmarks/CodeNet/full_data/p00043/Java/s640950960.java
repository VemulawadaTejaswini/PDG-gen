import java.util.*;
import static java.lang.Math.*;
import java.io.*;
public class Main {
	static   boolean[] ans= new boolean[10];
	static int[] temp;
	static int[] temp2;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter pr=new PrintWriter(System.out);
		while(sc.hasNext()){
			char[] cha=sc.next().toCharArray();
			temp=new int[10];
			for(int i=0;i<13;i++)temp[(int)cha[i]-(int)'0']++;
			ArrayList<Integer> ans=new ArrayList<Integer>();
			temp2=new int[10];

			for(int i=1;i<10;i++){
				for(int j=1;j<10;j++){
					if(temp[i]<4){
						temp2 = temp.clone();
						temp2[i]++;
						temp2[j]-=2;
						for(int k=1;k<8;k++){
							if(temp2[k]<0){
								temp2[9]=-1;
								break;
							}
							if(temp2[k]==1 || temp2[k]==4){
								temp2[k]--;
								temp2[k+1]--;
								temp2[k+2]--;
							}else if(temp2[k]==2){
								temp2[k]-=2;
								temp2[k+1]-=2;
								temp2[k+2]-=2;
							}
						}
						if(temp2[8]>=0&&temp2[8]%3==0&&temp2[9]>=0&&temp2[9]%3==0){
							ans.add(i);
							break;
						}
					}
				}
			}



			if(ans.size()==0)pr.println(0);            
			else {
				for(int i=0;i<ans.size();i++){
					if(i!=0)pr.print(" ");
					pr.print(ans.get(i));
				}
				pr.println();
			}
		}
		pr.flush();
	}
}