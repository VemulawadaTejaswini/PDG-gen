import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			char[] cArray=sc.next().toCharArray();
			String[] strArray=new String[3];
			for(int i=0;i<strArray.length;i++){
				strArray[i]="";
			}
			int ptr=0;
			for(int i=0;i<cArray.length&&ptr<3;i++){
				if(Character.isDigit(cArray[i])||cArray[i]=='X'){
					strArray[ptr]+=cArray[i];
				}else{
					ptr++;
				}
			}
			boolean flag=false;
			for(int i=0;i<=9;i++){
				int[] a=new int[3];
				for(int j=0;j<3;j++){
					a[j]=Integer.parseInt(strArray[j].replace("X",Integer.toString(i)));
				}
				if(a[0]+a[1]==a[2]){
					System.out.println(i);
					flag=true;
					break;
				}
			}
			if(!flag){
				System.out.println("NA");
			}
		}
	}
}