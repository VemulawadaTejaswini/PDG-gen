import java.util.Scanner;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String longest="";
		String sentence;
		int maxlength=0;
		int n1 = 0;
		int max2 = 0;
		int count[] = new int[1000];
		sentence= sc.nextLine();//???????????\???
		String max[]=sentence.split(" ");
		
		for(int  i = 0; i<max.length;i++){//?????§?????????????????????
			for(int j = 0; j < max.length;j++){
				if(max[i]=="")continue;
				if(max[j]=="")continue;
				if(max[i].equals(max[j])){//????????????????????????
					count[i]++;
				}
			}
			if(max2<count[i]){//?????§????????´??°
				max2 = count[i];
			}
		}
		if(max[n1].length()>maxlength){
			longest = max[n1];
			maxlength = max[n1].length();
		}
		for(int i = 0; i<max.length;i++){
			if(count[i]==max2){
				System.out.println(max[i]+" "+longest);
				break;
			}
		}
	}
}